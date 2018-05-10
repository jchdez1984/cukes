package nicebank.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import nicebank.AtmServer;
import org.springframework.beans.factory.annotation.Autowired;
import support.KnowsTheDomain;

public class ServerHooks {
    @Autowired
    KnowsTheDomain helper;

    public static final int PORT = 8887;

    private AtmServer server;

    @Before
    public void startServer() throws Exception {
        server = new AtmServer(PORT, helper.getCashSlot(), helper.getMyAccount());
        server.start();
    }

    @After
    public void stopServer() throws Exception{
        server.stop();
    }
}
