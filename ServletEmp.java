package com.tka;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/empinfo")

public class ServletEmp extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("name1");
		String lname = req.getParameter("lname1");
		String salary = req.getParameter("salary");
		String role = req.getParameter("role");
		String joindate = req.getParameter("join date");
		String exp = req.getParameter("exp");
		String city = req.getParameter("city");
		String country = req.getParameter("country");
		String emailid = req.getParameter("emailid");
		String mobno = req.getParameter("mob-no");
		String age = req.getParameter("age");
		String maritalstatus = req.getParameter("marital-status");
		String Dob = req.getParameter("dob");
		String password = req.getParameter("password");

		System.out.println(fname);
		System.out.println(lname);
		System.out.println(salary);
		System.out.println(role);
		System.out.println(joindate);
		System.out.println(exp);
		System.out.println(city);
		System.out.println(country);
		System.out.println(emailid);
		System.out.println(mobno);
		System.out.println(age);
		System.out.println(maritalstatus);
		System.out.println(Dob);
		System.out.println(password);

		PrintWriter out = resp.getWriter();
		out.println(fname);
		out.println(lname);
		out.println(salary);
		out.println(role);
		out.println(joindate);
		out.println(exp);
		out.println(city);
		out.println(country);
		out.println(emailid);
		out.println(mobno);
		out.println(age);
		out.println(maritalstatus);
		out.println(Dob);
		out.println(password);

	}

}
