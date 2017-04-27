package de.testprojekt;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class LifeCycleListener
 *
 */
public class LifeCycleListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public LifeCycleListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	 System.out.println("---------------------------------");
         System.out.println("Kapott, Arsch!!!!");
         System.out.println("---------------------------------");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         System.out.println("---------------------------------");
         System.out.println("Servlet ist da, Du Arsch!");
         System.out.println("---------------------------------");
    }
	
}
