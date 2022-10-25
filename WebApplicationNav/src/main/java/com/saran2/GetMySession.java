package com.saran2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetMySession extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		HttpSession session=request.getSession();
		if(session!=null) {
			String uname=(String)session.getAttribute("abc");
			pw.println(" GetMySession  "+uname);
			pw.println("<a href='logout'>Logout</a>");
		}
		
		
	}

}
