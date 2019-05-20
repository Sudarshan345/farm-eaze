package com.farmeaze.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmeaze.javafiles.DBOperations;
import com.farmeaze.javafiles.ProviderIdRetrive;
import com.farmeaze.javafiles.TimeSlots;

/**
 * Servlet implementation class SlotbookingServlet
 */
@WebServlet("/SlotbookingServlet")
public class SlotbookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SlotbookingServlet() {
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
		//request.setAttribute("id",ProviderIdRetrive.retrive(request.getParameter("name"), request.getParameter("mno")));
		int id=ProviderIdRetrive.retrive(request.getParameter("name"), request.getParameter("mno"));
		List<TimeSlots> sl=DBOperations.timeslots(id);
		request.setAttribute("list", sl);
		request.setAttribute("p_id", id);
		
		request.getRequestDispatcher("slotbooking.jsp").forward(request, response);
		
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
