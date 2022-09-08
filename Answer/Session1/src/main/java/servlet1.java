
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  @Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Registration Form</title>\r\n"
				+ "</head>\r\n"
				+ "<body style= \"margin:100px; border:1px solid red\" >\r\n"
				+ "\r\n"
				+ "<center>\r\n"
				+ "REGISTRATION PAGE"
				+ "	<form style= \"margin:20px\"  method=\"get\" action=\"servlet1\">\r\n"
				+ "	<table>\r\n"
				+ "		<tr>\r\n"
				+ "		<td> Name </td>\r\n"
				+ "		<td> <input type=\"text\" name=\"name\" ></td>\r\n"
				+ "		</tr>\r\n"
				+ "		<tr>\r\n"
				+ "		<td> DOB </td>\r\n"
				+ "		<td> <input type=\"date\" name=\"dob\"></td>\r\n"
				+ "		</tr>\r\n"
				+ "		<tr>\r\n"
				+ "		<td> Gender </td>\r\n"
				+ "		<td> <input type=\"radio\" name=\"gender\" value=\"male\">Male\r\n"
				+ "			 <input type=\"radio\" name=\"gender\" value=\"female\">Female\r\n"
				+ "		</td>\r\n"
				+ "		</tr>\r\n"
				+ "		<tr>\r\n"
				+ "		<td> Qualification </td>\r\n"
				+ "		<td> \r\n"
				+ "		<select name =\"qlfy\">\r\n"
				+ "		<option value=\"\" selected =\"selected\"> Select </option>\r\n"
				+ "		<option value =\"B.tech\"> B.Tech </option> \r\n"
				+ "		<option value =\"B.com\"> B.Com </option> \r\n"
				+ "		<option value =\"B.A\"> B.A </option> \r\n"
				+ "		<option value =\"Medico\"> Medico </option> \r\n"
				+ "		</select>\r\n"
				+ "		</td>\r\n"
				+ "		</tr>\r\n"
				+ "		<tr>\r\n"
				+ "		<td> Hobbies </td>\r\n"
				+ "		<td>\r\n"
				+ "		<input type=\"checkbox\" name=\"hb\" value=\"Reading\">Reading\r\n"
				+ "		<input type=\"checkbox\" name=\"hb\" value=\"Web Series\">Web Series\r\n"
				+ "		<input type=\"checkbox\" name=\"hb\" value=\"Cricket\">Cricket\r\n"
				+ "		<input type=\"checkbox\" name=\"hb\" value=\"Travel\">Travel\r\n"
				+ "		</td>\r\n"
				+ "		</tr>\r\n"
				+ "		<tr>\r\n"
				+ "		<td> <button type=\"submit\"> Submit </button></td>\r\n"
				+ "		<td> <button type=\"reset\"> Reset</button></td>\r\n"
				+ "		</tr>\r\n"
				+ "\r\n"
				+ "	</table>\r\n"
				+ "	</form>\r\n"
				+ "</center>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String gender = req.getParameter("gender");
	    String qlfy = req.getParameter("qlfy");
	    String[] hobbies = req.getParameterValues("hb");
	    List<String> al = Arrays.asList(hobbies);
	    String al2 = al.toString();
//	    for(int i = 0; i< al.size();i++) {
//	    	al2 += al.get(i);
//	    }
	    
	    out.println("name: "+name+"<br>");
	    out.println("Dob: "+dob+ "<br>");
	    out.println("Gender: "+gender+ "<br>");
	    out.println("Qualification: "+qlfy+ "<br>");
	    out.println("Hobbies: "+al+ "<br>");
	  
	  
	    HttpSession hs=req.getSession();
	    hs.setAttribute("fname", name);
	    hs.setAttribute("dateofbirth", dob);
	    hs.setAttribute("Gender", gender);
	    hs.setAttribute("hobbies", al2);
	    
	    out.print("Print via Session:-");
	    out.print("<br>");
	    out.print(hs.getAttribute("fname"));
	    out.print("<br>");
	    out.print(hs.getAttribute("dateofbirth"));
	    out.print("<br>");
	    out.print(hs.getAttribute("Gender"));
	    out.print("<br>");
	    out.print(hs.getAttribute("hobbies"));
	    
	    Cookie ck = new Cookie("qualification",qlfy);
	    Cookie ck2=new Cookie ("hobbies",al2);
	    res.addCookie(ck);
	    res.addCookie(ck2);
	   
	    Cookie cook=null;
	    Cookie cook2[]=null;
	    cook2=req.getCookies();
	    for(int i=0;i<cook2.length;i++) {
	    	cook=cook2[i];
	    	out.print("The name of cookie is: "+cook.getName()+" and the value is: "+cook.getValue());
	    	out.print("<br>");
	    }
	    out.close();
	}

}
