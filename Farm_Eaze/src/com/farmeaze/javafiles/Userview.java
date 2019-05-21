package com.reg.servlets;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Userview {
	public static List<Userbean> userl() {
		Connection conn = DBconnection.getConnection();
		List<Userbean> li = new ArrayList<>();

		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select user_name,mobile_number,pincode,village from farmeaze.users_table");
			
			while (rs.next()) {
				Userbean ub = new Userbean();
				ub.user_name = rs.getString(1);
				ub.mobile_number = rs.getString(2);
				ub.pincode = rs.getString(3);
				ub.village = rs.getString(4);
				li.add(ub);
			System.out.println(ub);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;

	}
}
