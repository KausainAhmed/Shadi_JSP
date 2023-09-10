package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.module.UserDetails;

@WebServlet("/shadi")
public class Controller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	UserDao ud = new UserDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action.equals("create")) {
			addUser(req, resp);
		} else if (action.equals("find")) {
			int s = Integer.parseInt(req.getParameter("age"));
			UserDetails fu = ud.findUser(s);
			
			PrintWriter out = resp.getWriter();
			out.print(fu);
		}else if(action.equals("delete")) {
			int s = Integer.parseInt(req.getParameter("age"));
			UserDetails fu = ud.userDelete(s);
		}
		
	}

	private void addUser(HttpServletRequest req, HttpServletResponse resp) {
		int s1 = Integer.parseInt(req.getParameter("age"));
		String s2 = req.getParameter("name");
		String s3 = req.getParameter("email");
		String s4 = req.getParameter("gender");
		String s5 = req.getParameter("country");
		String s6 = req.getParameter("city");
		String s7 = req.getParameter("mnumber");

		UserDetails u = new UserDetails();
		u.setAge(s1);
		u.setName(s2);
		u.setEmail(s3);
		u.setGender(s4);
		u.setCountry(s5);
		u.setCity(s6);
		u.setMnumber(s7);

		ud.save(u);
		try {
			resp.setContentType("text/html");

			PrintWriter out = resp.getWriter();
			out.println("<h1>Successfull</h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}