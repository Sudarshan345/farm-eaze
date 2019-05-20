package com.farmeaze.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmeaze.javafiles.Equipment_insert;

/**
 * Servlet implementation class Equipment_insert_servlet
 */
@WebServlet("/Equipment_insert_servlet")
public class Equipment_insert_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Equipment_insert_servlet() {
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
		String[] eqps = request.getParameterValues("equipment");
		request.getParameter("landleveler_desc");
		request.getParameter("2mbplough_desc");
		request.getParameter("reversable2mbplough_desc");
		request.getParameter("reversableplough_desc");
		request.getParameter("discplough_desc");
		request.getParameter("rotovator_desc");
		request.getParameter("puddler_desc");
		request.getParameter("multicroptresher_desc");
		request.getParameter("seedcumfeltilizedrill_desc");
		request.getParameter("combinedharvester_desc");
		request.getParameter("trolley_desc");
		request.getParameter("baler_desc");
		ServletContext sc = request.getServletContext();
		String idq = (String) sc.getAttribute("provider_id");
		System.out.println("-----------------------------------------" + "-------------->" + idq);
		int id = Integer.parseInt(idq);

		System.out.println("..................id......before for:" + id);
		for (int i = 0; i < eqps.length; i++) {
			System.out.println(eqps[i]);
			switch (eqps[i]) {

			case "landleveler":
				Equipment_insert.insertequipment(id, eqps[i], request.getParameter("landleveler_desc"));
				break;
			case "2mbplough":
				System.out.println("v2");
				Equipment_insert.insertequipment(id, eqps[i], request.getParameter("2mbplough_desc"));
				break;
			case "reversable2mbplough":
				Equipment_insert.insertequipment(id, eqps[i], request.getParameter("reversable2mbplough_desc"));
				System.out.println("v3");
				break;
			case "reversableplough":
				Equipment_insert.insertequipment(id, eqps[i], request.getParameter("reversableplough_desc"));
				System.out.println("v4");
				break;
			case "discplough":
				Equipment_insert.insertequipment(id, eqps[i], request.getParameter("discplough_desc"));
				System.out.println("v5");
				break;
			case "rotovator":
				Equipment_insert.insertequipment(id, eqps[i], request.getParameter("rotovator_desc"));
				System.out.println("v5");
				break;
			case "puddler":
				Equipment_insert.insertequipment(id, eqps[i], request.getParameter("puddler_desc"));
				System.out.println("v5");
				break;
			case "multicroptresher":
				Equipment_insert.insertequipment(id, eqps[i], request.getParameter("multicroptresher_desc"));
				System.out.println("v5");
				break;
			case "seedcumfeltilizedrill":
				Equipment_insert.insertequipment(id, eqps[i], request.getParameter("seedcumfeltilizedrill_desc"));
				System.out.println("v5");
				break;
			case "combinedharvester":
				Equipment_insert.insertequipment(id, eqps[i], request.getParameter("combinedharvester_desc"));
				System.out.println("v5");
				break;
			case "trolley":
				Equipment_insert.insertequipment(id, eqps[i], request.getParameter("trolley_desc"));
				System.out.println("v5");
				break;
			case "baler":
				Equipment_insert.insertequipment(id, eqps[i], request.getParameter("baler_desc"));
				System.out.println("v5");
				break;

			}
		}

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
