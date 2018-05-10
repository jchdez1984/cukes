package nicebank;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class AtmServer {
    private final Server server;

    public AtmServer(int port, CashSlot cashSlot, Account account){
        server = new Server(port);

        ServletContextHandler contextHandler =
                new ServletContextHandler(ServletContextHandler.SESSIONS);
        contextHandler.setContextPath("/");
        server.setHandler(contextHandler);

        contextHandler.addServlet(new ServletHolder(new WithdrawalServlet(cashSlot, account)), "/withdraw");
        contextHandler.addServlet(new ServletHolder(new AtmServlet()), "/");
    }

    public void start() throws Exception{
        server.start();
        System.out.println("Listening on " + server.getURI());
    }

    public void stop() throws Exception{
        server.stop();
    }

    public static void main(String[] args) throws Exception{
        //new AtmServer(9988).start();
    }
}
