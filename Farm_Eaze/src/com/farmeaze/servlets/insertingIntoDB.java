package com.farmeaze.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class insertingIntoDB {
	public static void adddata(String user_name, String mobile_num, String village, String pincode) {
		Connection conn = DBConnection.getDBConnection();
		Statement stmt;

		try {
			stmt = conn.createStatement();
			String Query = "INSERT INTO farmeaze.user_details (`user_name`, `mobile_num`, `village`, `pincode`) VALUES('"
					+ user_name + "','" + mobile_num + "','" + village + "','" + pincode + "')";
			stmt.executeUpdate(Query);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void addProvider(String provider_name, String mobile_no, String product, String manufacturer_year,
			String str_reg_no, String Pincode, String village, String mandal, String district, String state) {
		Connection conn = DBConnection.getDBConnection();

		System.out.println(".......entered method");
		try {
			// INSERT INTO `farmeaze`.`providers_table` (`provider_id`, `provider_name`,
			// `mobile_number`, `product`, `manufacturer_year`, `tractor_reg_number`,
//`pincode`, `village`, `mandal`, `district`, `state`) 
//	VALUES ('7', 'john', '0345', '0345', '0345', '0345', '0345', '0345', '0345', '0345', '0345');

			String insertQuery = "INSERT INTO `farmeaze`.`providers_table`(`provider_name`, `mobile_number`, `product`, `manufacturer_year`, `tractor_reg_number`,`pincode`, "
					+ "`village`, `mandal`, `district`, `state`) " + " VALUES (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(insertQuery);
			psmt.setString(1, provider_name);
			psmt.setString(2, mobile_no);
			psmt.setString(3, product);
			psmt.setString(4, manufacturer_year);
			psmt.setString(5, str_reg_no);
			psmt.setString(6, Pincode);
			psmt.setString(7, village);
			psmt.setString(8, mandal);
			psmt.setString(9, district);
			psmt.setString(10, state);
			psmt.execute();
			System.out.println(".......exit method");
			conn.close();

		} catch (Exception e) {
			System.out.println("exception occured");
			e.printStackTrace();

		}

	}
}
