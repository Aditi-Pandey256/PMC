package Part1;

import java.io.IOException;
import java.util.Arrays;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/registration")
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw =res.getWriter();
		res.setContentType("text/html");
		
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String gender = req.getParameter("gender");
	    String qlfy = req.getParameter("qlfy");
	    String[] hobbies = req.getParameterValues("hb");
	    List<String> al = Arrays.asList(hobbies);
	    
	    pw.print("<center style = margin:200px>");
	    pw.println("Name: "+name+"<br>");
	    pw.println("Dob: "+dob+ "<br>");
	    pw.println("Gender: "+gender+ "<br>");
	    pw.println("Qualification: "+qlfy+ "<br>");
	    pw.println("Hobbies: "+al+ "<br>");
	    pw.print("</center>");  
	    pw.close();
	}

	

}
