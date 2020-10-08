package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	ServletContext ctx = null;
    public ServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		ctx = config.getServletContext();
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

response.setContentType("text/html");
PrintWriter pw = response.getWriter();
String dname = ctx.getInitParameter("dname");
String url = ctx.getInitParameter("url");
String user = ctx.getInitParameter("user");
String password = ctx.getInitParameter("password");
pw.println("<h1 style = color:navy>");
String res = "Driver name = "+ dname+"<br>";
res += "URL = "+url+"<br>";
res += " User Name= "+ user+"<br>";
res += "Password = "+password +"<br>";
pw.println(res+"</h1>");

	}

}
