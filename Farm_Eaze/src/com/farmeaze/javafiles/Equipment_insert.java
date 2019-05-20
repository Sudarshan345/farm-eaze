package com.farmeaze.javafiles;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Equipment_insert {

	public static void insertequipment(int id, String equipmentname, String description) {
		Connection conn = null;
		java.sql.Statement st;

		try {
			conn = DBconnection.getConnection();
			st = conn.createStatement();
			//INSERT INTO `farmeaze`.`equipment_table` (`provider_id`, `equipment_name`, `equipment_description`) VALUES ('1', 'cultivator', 'cultivator with 8 ');
		
			String insertQuery = "INSERT INTO `farmeaze`.`equipment_table` (`provider_id`, `equipment_name`, `equipment_description`)"
					+ " VALUES ("+id+", '"+equipmentname+"', '"+description+"')";
			st.executeUpdate(insertQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}