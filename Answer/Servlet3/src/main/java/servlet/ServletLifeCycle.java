package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init() {
       
        System.out.println("Servlet Initialized!");
    }
 

    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
         
   
        response.setContentType("text/html");
         
        PrintWriter out = response.getWriter();
        out.print("<center style=margin:300px;>You have made the request</center>");
    }
     

    public void destroy() {
     
    }
}
	
