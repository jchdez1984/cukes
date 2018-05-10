package nicebank;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import support.KnowsTheDomain;

public class CashSlotSteps {
    @Autowired
    KnowsTheDomain helper;

    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", dollars, helper.getCashSlot().getContents());
    }
}
