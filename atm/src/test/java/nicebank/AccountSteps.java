package nicebank;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import support.KnowsTheDomain;
import transforms.MoneyConverter;

public class AccountSteps {
    @Autowired
    KnowsTheDomain helper;

    @Given("^I have credited (\\$\\d+\\.\\d+) in my account$")
    public void i_have_credited_$_in_my_account(@Transform(MoneyConverter.class)Money amount) throws Throwable {
        helper.getMyAccount().credit(amount);
        Assert.assertEquals("Incorrect account balance -", amount, helper.getMyAccount().getBalance());
    }

    @Then("^the balance of my account should be (\\$\\d+\\.\\d+)$")
    public void the_balance_of_my_account_should_be_$(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        Assert.assertEquals("Incorrect account balance -", amount, helper.getMyAccount().getBalance());
    }
}
