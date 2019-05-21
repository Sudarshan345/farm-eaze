package com.reg.servlets;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Deleteproviderrow {
	public static int retriveid(String mobileno, String pincode) {
		Connection conn = (Connection) DBconnection.getConnection();
		Statement st;
		ResultSet rs = null;
		int provider_id = 0;

		try {
			st = conn.createStatement();
			rs = st.executeQuery("select provider_id from farmeaze.provider_details where(pincode='" + pincode
					+ "' and mobile_no='" + mobileno + "')");
			while (rs.next()) {
				provider_id = rs.getInt(1);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return provider_id;
	}

	public static int delete_provider(int p_id) throws SQLException {
		Connection conn = (Connection) DBconnection.getConnection();
		Statement st;

		st = conn.createStatement();
		String deleteQuery = ("delete from farmeaze.provider_details where provider_id=" + p_id + "");
		int noofrowsdeleted = st.executeUpdate(deleteQuery);
		conn.close();
		return noofrowsdeleted;
	}

}
