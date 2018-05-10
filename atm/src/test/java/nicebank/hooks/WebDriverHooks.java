package nicebank.hooks;

import cucumber.api.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.springframework.beans.factory.annotation.Autowired;
import support.KnowsTheDomain;

public class WebDriverHooks {
    @Autowired
    KnowsTheDomain helper;

    @After
    public void finish(Scenario scenario) {
        try {
            byte[] screenshot =
                    helper.getWebDriver().getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        finally {
            helper.getWebDriver().close();
        }
    }
}
