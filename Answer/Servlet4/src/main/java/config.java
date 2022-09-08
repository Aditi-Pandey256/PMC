
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/config", initParams= {
@WebInitParam(name="Name",value="Aditi"),
@WebInitParam(name="Password", value ="Pandey"),
@WebInitParam(name="E-mail", value ="aditispandey256@gmail.com")})

public class config extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
		{
	
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter(); 
	    
	    out.print("Printed via Config:-");
	    out.print("<br>");
	      
	    ServletConfig config=getServletConfig();
	    Enumeration<String> e=config.getInitParameterNames();  
	        
	    String str="";  
	    while(e.hasMoreElements()){  
	    str=e.nextElement();  
	    out.print("<br> "+str);  
	    out.print(" : "+ config.getInitParameter(str));   
	    }
	     
	       {
	       out.print("<br>");
	       out.print("<br>");
	       out.print("<br>");
	       out.print("Printed via Context:-");
		   out.print("<br>");
	       
	       ServletContext context=getServletContext();  
	       Enumeration<String> en=context.getInitParameterNames();  
	             
	      String str1="";  
	       while(en.hasMoreElements()){  
	           str1=en.nextElement();  
	           out.print("<br>"+str1);
	           out.print(" : "+context.getInitParameter(str1));
	       }
	    
}
}
}