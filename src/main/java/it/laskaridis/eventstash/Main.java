package it.laskaridis.eventstash;

import org.eclipse.jetty.server.Server;

public class Main {

    public static void main(String[] args) throws Exception {

        Server server = ServerFactory.create();

        try {
            server.start();
            server.join();
        } finally {
            server.destroy();
        }
    }
}
