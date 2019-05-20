package com.farmeaze.javafiles;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ProviderIdRetrive {

	public static int retrive(String name, String mobilenumber) {
		Connection conn = DBconnection.getConnection();
		java.sql.Statement st;
		ResultSet rs = null;
		int provider_id = 0;

		try {
			st = conn.createStatement();
			rs = st.executeQuery("select provider_id from farmeaze.providers_table where(provider_name='" + name
					+ "' and mobile_number='" + mobilenumber + "')");
			while (rs.next()) {
				provider_id = rs.getInt(1);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return provider_id;
	}
}