package scope;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class read extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
	    String qlfy = request.getParameter("qlfy");
	   
//	    
//	    out.print("<center style = margin:200px>");
//	    out.println("Name: "+name+"<br>");
//	    out.println("Dob: "+dob+ "<br>");
//	    out.println("Gender: "+gender+ "<br>");
// out.println("Qualification: "+qlfy+ "<br>");
//	    out.println("Hobbies: "+al+ "<br>");
//	    out.print("</center>");  
	    
	   
	    
	    out.print("<html>\r\n"
	    		+ "<head>\r\n"
	    		+ "<meta charset=\"ISO-8859-1\">\r\n"
	    		+ "<title>Registration Form</title>\r\n"
	    		+ "<style>\r\n"
	    		+ ".mar{\r\n"
	    		+ "margin-top:200px;\r\n"
	    		+ "}\r\n"
	    		+ ".form{\r\n"
	    		+ "margin-top:20px;\r\n"
	    		+ "}\r\n"
	    		+ "\r\n"
	    		+ "</style>\r\n"
	    		+ "</head>");
	    out.print("<body>");
	   out.print("<center>\r\n"
	   		+ "<div class =\"mar\"><b>Registration Form</b>\r\n"
	   		+ "</div>		\r\n"
	   		+ "	<form class =\"form\" method=\"get\" action=\"update\">\r\n"
	   		+ "	<table>\r\n"
	   		+ "		<tr>\r\n"
	   		+ "		<td> Name </td>\r\n"
	   		+ "		<td> <input type=\"text\" name=\"name\" value="+name+"></td>\r\n"
	   		+ "		</tr>\r\n"
	   		+ "		<tr>\r\n"
	   		+ "		<td> DOB </td>\r\n"
	   		+ "		<td> <input type=\"date\" name=\"dob\" value="+dob+"></td>\r\n"
	   		+ "		</tr>");
	   out.print("<tr>\r\n"
	   		+ "		<td> Gender </td>");
	   if(gender.equals("male")) {
		  // out.print("male");
		   out.print("<td> <input type=\"radio\" name=\"gender\" value=\"male\" checked >Male");
		   out.print("&nbsp &nbsp<input type=\"radio\" name=\"gender\" value=\"female\">Female");
	   }
	   else {
//		   out.print("female");
		   out.print("<td> <input type=\"radio\" name=\"gender\" value=\"male\" >Male");
		   out.print("&nbsp &nbsp <input type=\"radio\" name=\"gender\" value=\"female\" checked >Female");
	   }
	   out.print("</td>\r\n"
	   		+ "		</tr>");
    out.print("<td> Qualification </td>\r\n"
    		+ "		<td> \r\n"
    		+ "		<select name =\"qlfy\">\r\n"
    		+ "		<option value="+qlfy+" selected="+qlfy+">"+qlfy+"</option>\r\n"
    		+ "		<option value =\"B.Tech\"> B.Tech </option> \r\n"
    		+ "		<option value =\"B.Com\"> B.Com </option> \r\n"
    		+ "		<option value =\"B.A\"> B.A </option> \r\n"
    		+ "		<option value =\"Medico\"> Medico </option> \r\n"
    		+ "		</select>"
    		+ "		</td>\r\n"
    		+ "		</tr>");
    out.print("		<tr>\r\n"
    		+ "		<td> <button type=\"submit\"> UPDATE </button></td>\r\n"
    		+ "		</tr>\r\n");
    out.print("</table>\r\n"
    		+ "	</form>\r\n"
    		+ "</center>");
    
	    out.print("</body>");
	    out.print("</html>");
	    
	    
	    out.close();
	}




}
