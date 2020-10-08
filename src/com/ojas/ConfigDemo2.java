package com.ojas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ConfigDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	String cnames="";
    public ConfigDemo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		cnames = config.getInitParameter("cname");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<form action=ConfigDemo method= POST>");
		pw.println("welcome to registration");

		String cns[] = cnames.split(",");
		pw.println("<table align=center cellpadding=20px border=1>");
		pw.println("<tr><td>Select course name:</td><td>");
		pw.println("<select name=cname>");
		for(String x:cns) {
		 pw.println("<option>"+x+"</option>");
		}
		pw.println("</select></td></tr><tr>"
		+"<td colspan=2 align=center>"+
				"<input type=submit value=Register></td></tr>");
		pw.println("<table></form>");
		}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String cnames[] = {"JAVA",".NET","TESTING","ORACLE","PHP"};
		double prices[] = {20000,1500,75222,52563,2323};
		String cname = request.getParameter("cname");
		int ind = 0;
		for(int i = 0;i<cnames.length;i++)
		{
		if(cnames[i].equals(cname)) {
		ind = i;
		}
		}
		pw.println("success");
		pw.println("your select course is"+cname+"<br>");
		pw.println("you need to pay is." +prices[ind]+"only<br>");
		pw.println("Thank you</h1>");
	}
	}


