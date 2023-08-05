package com.js.cookie;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login1")
public class login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	     String email=req.getParameter("email");
	     int password = Integer.parseInt(req.getParameter("pwd"));
	     if(email.equals("allen@gmail.com") && password==123) {
	    //	 Cookie c = new Cookie("abc", "xyz");
	    //	 resp.addCookie(c);
	    	 HttpSession hs = req.getSession();
	    	 hs.setAttribute("abc", "xyz");
	    	 RequestDispatcher rd = req.getRequestDispatcher("home1.jsp");
	    	 rd.forward(req, resp);
	     }else {
	    	 PrintWriter pw = resp.getWriter();
	    	 pw.write(" <html>\r\n" + 
	    	 		"     <body>\r\n" + 
	    	 		"       <h4 style=\"color:red\">Email or Password wrong</h4>\r\n" + 
	    	 		"     </body>\r\n" + 
	    	 		"     </html>\r\n" + 
	    	 		"     ");
	    	 RequestDispatcher rd = req.getRequestDispatcher("login1.jsp");
	    	 rd.include(req, resp);
	     }
	
	}
}
