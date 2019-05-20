package com.farmeaze.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmeaze.javafiles.DBOperations;

/**
 * Servlet implementation class Time_into_db
 */
@WebServlet("/Time_into_db")
public class Time_into_db extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Time_into_db() {
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
		String fD = request.getParameter("fromDate");
		String ft = request.getParameter("ftime");
		String td = request.getParameter("toDate");
		String tt = request.getParameter("ttime");
		String id = request.getParameter("id");
		Integer pid = Integer.parseInt(id);
		DBOperations.timeDB(fD, ft, td, tt, pid);
		request.getRequestDispatcher("success.html").forward(request, response);

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
