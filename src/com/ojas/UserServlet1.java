package com.ojas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class UserServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Enumeration e = request.getParameterNames();
		while(e.hasMoreElements()) {
		String field_name = (String) e.nextElement();
		String value = request.getParameter(field_name);
		pw.println("<h1 style=color:green;>"+field_name+" = "+value+ "</h1><br>");


	}

}
}