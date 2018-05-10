package support;

import nicebank.Account;
import nicebank.Teller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class AtmUserInterface implements Teller {


    static {
        System.setProperty("webdriver.gecko.driver", "lib/geckodriver");
    }

    private EventFiringWebDriver webDriver;

    public AtmUserInterface() {
        this.webDriver = new EventFiringWebDriver(new FirefoxDriver());
    }

    public void withdrawFrom(Account account, int dollars) {
        try {
            webDriver.get("http://localhost:8887");
            webDriver.findElement(By.id("amount"))
                    .sendKeys(String.valueOf(dollars));
            webDriver.findElement(By.id("withdraw")).click();

        } finally {
            webDriver.close();
        }
    }
}
