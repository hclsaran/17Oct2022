package com.saran2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session() {
        super();
        // TODO Auto-generated constructor stub
    }
 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd");
		
		if(username.equals("Jessica")&& password.equals("123")) {
			 pw.println("Session Welcome"+username);
			 HttpSession session=request.getSession();
			 session.setAttribute("abc", username);
			 RequestDispatcher rd1=request.getRequestDispatcher("/mysession");
				rd1.forward(request, response);
			 
		}else {
			pw.print("Invalid UserName/Password");
			RequestDispatcher rd1=request.getRequestDispatcher("/index.jsp");
			rd1.include(request, response);
		}
		}
		
	}


