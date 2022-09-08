package requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginpage")
public class loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	     
	     String a = request.getParameter("username");
	     
	     String b = request.getParameter("userpassword");
	     
	     if (a.equals("Aditi") && b.equals("Pandey") ) {
	    	 RequestDispatcher rd = request.getRequestDispatcher("forwarded");
	    	 rd.forward(request, response);
	    	 
	     }
	     else {
	    	 out.println("<center>\"Password did'nt match\"</center>");
	    	 RequestDispatcher rd = request.getRequestDispatcher("/index.html");
	         
	         rd.include(request, response); 
	     }
	}
	

}
