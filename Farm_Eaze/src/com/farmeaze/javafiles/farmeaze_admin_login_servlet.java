package com.farmeaze.javafiles;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Farmeazeservlet
 */
@WebServlet(name = "FarmerLogin", urlPatterns = { "/ABC" }, initParams = {

		@WebInitParam(name = "AdminID", value = "admin"), @WebInitParam(name = "password", value = "admin") })

/*
 * @WebServlet(name = "servletParamAnnotation", urlPatterns = {
 * "/ServletConfigTest" }, initParams = {
 * 
 * @WebInitParam(name = "AdminID", value = "SudarshanSQL"), @WebInitParam(name =
 * "Password", value = "0000") })
 */

public class farmeaze_admin_login_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public farmeaze_admin_login_servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("test");
		String id = request.getParameter("name");
		String password = request.getParameter("pswd");
		System.out.println("passsword is succcess");
		ServletConfig sf = getServletConfig();
		String name = sf.getInitParameter("AdminID");
		String pswd = sf.getInitParameter("password");
		if (id.equals(name) && password.equals(pswd)) {
			request.getRequestDispatcher("adminDashboard.html").forward(request, response);

		} else {
			request.getRequestDispatcher("Farmloginfail.html").forward(request, response);

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
