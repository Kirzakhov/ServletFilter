package com.vivek;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("In Servlet");
		int i =Integer.parseInt(req.getParameter("id"));
		String n = req.getParameter("name");
		
		PrintWriter out = res.getWriter();
		out.println("Welcome "+n);
	}
}
