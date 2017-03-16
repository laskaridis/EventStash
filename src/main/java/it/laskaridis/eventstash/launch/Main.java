package it.laskaridis.eventstash.launch;

import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

/**
 * Created by lefteris on 3/16/17.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        String webAppDirLocation = "src/main/webapp";
        Tomcat tomcat = new Tomcat();

        String port = System.getenv("PORT");
        if ((port == null) || port.isEmpty()) {
            port = "8080";
        }
        tomcat.setPort(Integer.valueOf(port));

        StandardContext ctx = (StandardContext) tomcat.addWebapp("/",
                new File(webAppDirLocation).getAbsolutePath());
        System.out.println("configuring app with basedir: " +
                new File("./" + webAppDirLocation).getAbsolutePath());

        File additinalWebInfClasses = new File("target/classes");
        WebResourceRoot resources = new StandardRoot(ctx);
        resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes",
                additinalWebInfClasses.getAbsolutePath(), "/"));
        ctx.setResources(resources);

        tomcat.start();
        tomcat.getServer().await();
    }
}
