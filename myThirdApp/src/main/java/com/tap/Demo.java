package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet
{

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String number=req.getParameter("number");
		
		 pw.println("Welcome " + name +" "+ number+" " + email);
//		 resp.sendRedirect("testServlet");
		 RequestDispatcher rd = req.getRequestDispatcher("testServlet");
		 rd.include(req, resp);
	}
}
