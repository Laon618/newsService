package net.newsService;

import java.io.File;

import org.apache.catalina.startup.Tomcat;

public class webServerLauncher {
	
	 public static void main(String[] args) throws Exception {
	        String webappDirLocation = "WebContent";
	        
	        
	        Tomcat tomcat = new Tomcat();

	        String webPort = System.getenv("8080");
	        
	        if(webPort == null || webPort.isEmpty()) {
	            webPort = "8080";
	        }

	        tomcat.setPort(Integer.valueOf(webPort));

	        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
	        System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());

	        tomcat.start();
	        tomcat.getServer().await();
	    }
	 
}
