package it.laskaridis.eventstash.api;

import it.laskaridis.eventstash.ServerFactory;
import org.eclipse.jetty.server.Server;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class ResourceTest {

    protected static Server server;
    protected static WebTarget target;

    @BeforeClass
    public static void setUp() throws Exception {
        server = ServerFactory.create();
        server.start();

        Client client = ClientBuilder.newClient();
        target = client.target(server.getURI()).path("/");
    }

    @AfterClass
    public static void teardown() throws Exception {
        server.stop();
    }
}
