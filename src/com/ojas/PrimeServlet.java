package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class PrimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public PrimeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<form action=PrimeServlet method=POST>");
		pw.println("<h1>PrimeDemo</h1>");
		pw.println("Enter any number:<input type=text name=num><br><br>");
		pw.println("<input type=submit value=checkPrime>");



	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int num = Integer.parseInt(request.getParameter("num"));
		int i = 2,flag = 0;
		while(i < num ) {
		if (num % i == 0) {
		flag++;
		break;
		}
		i++;
		}
		if(flag == 0) {
			pw.println("is prime");
			}else {
			pw.println("not a prime");
			}

		
	}
	
		
	

}
