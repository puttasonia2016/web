package com.ojas;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CalServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CalServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String value = request.getParameter("b1");
		if(value.equals("Add")){
		pw.println("Addition = "+(num1 + num2));
		}
		else if(value.equals("Sub")){
		pw.println("subtraction= "+(num1 - num2));
		}
		else if(value.equals("Mul")){
		pw.println("multipli = "+(num1 * num2));
		}
		else {
			pw.println("division = "+(num1 / num2));
		}
     pw.close();
	}

}
