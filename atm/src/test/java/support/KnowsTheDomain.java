package support;

import nicebank.Account;
import nicebank.CashSlot;
import nicebank.AutomatedTeller;
import nicebank.Teller;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class KnowsTheDomain {
    private Account myAccount;
    private CashSlot cashSlot;
    private Teller teller;
    private EventFiringWebDriver webDriver;

    public Account getMyAccount() {
        if(myAccount == null){
            myAccount = new Account();
        }
        return myAccount;
    }

    public CashSlot getCashSlot() {
        if(cashSlot == null){
            cashSlot = new CashSlot();
        }
        return cashSlot;
    }

    public Teller getTeller() {
        if (teller == null){
            teller = new AtmUserInterface();
        }
        return teller;
    }

    public EventFiringWebDriver getWebDriver() {
        if (webDriver == null){
            webDriver = new EventFiringWebDriver(new FirefoxDriver());
        }

        return webDriver;
    }
}
