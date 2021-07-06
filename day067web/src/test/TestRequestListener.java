package test;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class TestRequestListener implements HttpSessionListener{
    public void requestDestroyed(ServletRequestEvent sre) {
        HttpServletRequest req=(HttpServletRequest)sre.getServletRequest();
        System.out.println("request死监听");
    }

    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest req=(HttpServletRequest)sre.getServletRequest();
        for(int number=0;number<10;number++) {
//            System.out.println(sre.getServletContext().getSessionCookieConfig().getParameter("id"+number));            
        }
        System.out.println("request生监听"+req.getServletPath());
        System.out.println("request生监听"+req.getQueryString());
    }  
}
