package nicebank;

import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import support.KnowsTheDomain;

public class TellerSteps {
    @Autowired
    KnowsTheDomain helper;

    @When("^I withdraw \\$(\\d+)$")
    public void i_withdraw_$(int dollars) throws Throwable {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
    }
}
