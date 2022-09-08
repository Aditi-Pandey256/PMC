package scope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class update extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		
//
		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
	    String qlfy = request.getParameter("qlfy");
	    ServletContext context=getServletContext();  
	    String title=context.getInitParameter("titleheading");  
	   // out.println(title);  
	  
	    
//	    out.print(name);
//	    out.print(dob);
//	    out.print(gender);
//	    out.print(qlfy);
//	    String[] hobbies = request.getParameterValues("hb");
//	    List<String> al = Arrays.asList(hobbies);
//	    
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
	   		+ "<div class =\"mar\"><b>"+title+"</b>\r\n"
	   		+ "</div>\r\n"
	   		+ "	<form class =\"form\" method=\"get\" action=\"saved\">\r\n"
	   		+ "	<table>\r\n"
	   		+ "		<tr>\r\n"
	   		+ "		<td> Name </td>\r\n"
	   		+ "		<td> <input type=\"text\" name=\"name\" value="+name+ " readonly></td>\r\n"
	   		+ "		</tr>\r\n"
	   		+ "		<tr>\r\n"
	   		+ "		<td> DOB </td>\r\n"
	   		+ "		<td> <input type=\"date\" name=\"dob\" value="+dob+" readonly></td>\r\n"
	   		+ "		</tr>");
	   out.print("<tr><td> Gender</td>"
	   		+ "<td>"+gender+""
	   		+ "</td></tr>");
	   out.print("</td>\r\n"
	   		+ "		</tr>");
	   out.print("<tr><td>Qualification</td><td>"+qlfy+"</td>");
	   
//    out.print("<td> Qualification </td>\r\n"
//    		+ "		<td> \r\n"
//    		+ "		<select name =\"qlfy\" readonly>\r\n"
//    		+ "		<option value=\"+qlfy+\" selected="+qlfy+" >"+qlfy+"</option>\r\n"
//    		+ "		<option value =\"B.Tech\"> B.Tech </option> \r\n"
//    		+ "		<option value =\"B.Com\"> B.Com </option> \r\n"
//    		+ "		<option value =\"B.A\"> B.A </option> \r\n"
//    		+ "		<option value =\"Medico\"> Medico </option> \r\n"
//    		+ "		</select>"
//    		+ "		</td>\r\n"
//    		+ "		</tr>");
//    out.print("UPDATED INFO");
    out.print("</table>\r\n"
    		+ "	</form>\r\n"
    		+ "</center>");
    
    
	


		
		
}
}
