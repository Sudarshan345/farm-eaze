package com.farmeaze.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmeaze.javafiles.ProviderIdRetrive;

/**
 * Servlet implementation class ProviderdetailsServlet
 */
@WebServlet("/ProviderdetailsServlet")
public class ProviderdetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProviderdetailsServlet() {
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
		String str_name = request.getParameter("provider_name");
		String str_mobile = request.getParameter("mobile_num");
		String str_product = request.getParameter("product");
		String str_manufacture = request.getParameter("maufacture_year");
		String str_reg_no = request.getParameter("reg_no");
		String str_pin = request.getParameter("pin");
		String str_village = request.getParameter("village");
		String str_mandal = request.getParameter("mandal");
		String str_district = request.getParameter("district");
		String str_state = request.getParameter("state");

		insertingIntoDB.addProvider(str_name, str_mobile, str_product, str_manufacture, str_reg_no, str_pin,
				str_village, str_mandal, str_district, str_state);

		Integer idi = ProviderIdRetrive.retrive(str_name, str_mobile);
		String id = idi.toString();
		ServletContext sc = request.getServletContext();
		sc.setAttribute("provider_id", id);
		System.out.println("..........." + id);
		request.getRequestDispatcher("equipments_insertion.jsp").forward(request, response);

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
