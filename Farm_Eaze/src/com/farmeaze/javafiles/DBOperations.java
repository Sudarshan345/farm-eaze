package com.farmeaze.javafiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBOperations {
	public static void adddata(String user_name, String mobile_num, String village, String pincode) {
		Connection conn = DBconnection.getConnection();
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

	public static void provideradddata(String provider_name, String mobile_no, String product, String manufacturer_year,
			String Tractor, String Pincode, String village, String mandal, String district, String state) {
		Connection conn = DBconnection.getConnection();
		Statement stmt;

		try {
			stmt = conn.createStatement();
			String Query = "INSERT INTO farmeaze.provider_details (`provider_name`, `mobile_no`, `product`, `manufacturer_year`, `Tractor`,`Pincode`, `village`, `mandal`, `district`, `state`) VALUES('"
					+ provider_name + "','" + mobile_no + "','" + product + "','" + manufacturer_year + "','" + Tractor
					+ "','" + Pincode + "','" + village + "','" + mandal + "','" + district + "','" + state + "')";
			stmt.executeUpdate(Query);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static ArrayList<Integer> equip_ids_retrive(int id) {
		Connection conn = DBconnection.getConnection();
		ArrayList<Integer> eqplist = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			String query = "select equipment_id from farmeaze.equipment_table where (provider_id=" + id + ")";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Integer i = rs.getInt(1);
				eqplist.add(i);
			}
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return eqplist;

	}

	public static void delete_equipments(int p_id, int e_id) {
		Connection conn = DBconnection.getConnection();
		try {
			Statement stmt = conn.createStatement();
			String query = "delete from farmeaze.equipment_table where (provider_id=" + p_id + " and equipment_id="
					+ e_id + ")";
			stmt.executeUpdate(query);
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<ProviderBean> providerdetails(String NameofEquipment) {
		Statement stmt = null;
		ResultSet rs;
		Connection conn = DBconnection.getConnection();
		List<ProviderBean> lis = new ArrayList<ProviderBean>();
		try {
			stmt = conn.createStatement();
			// SELECT
			/*
			 * provider_name, mobile_number,
			 * 
			 * equipment_name, equipment_description,
			 * 
			 * product, manufacturer_year, tractor_reg_number,
			 * 
			 * village, mandal, district, state, pincode FROM farmeaze.providers_table p
			 * 
			 * INNER JOIN farmeaze.equipment_table e ON p.provider_id = e.provider_id
			 * 
			 * WHERE
			 * 
			 * e.equipment_name = 'rotavator';
			 */

			String query = "SELECT provider_name,mobile_number,product,manufacturer_year,pincode,village,mandal,district,state FROM farmeaze.providers_table p "
					+ "INNER join farmeaze.equipment_table e on p.provider_id = e.provider_id where e.equipment_name ='"
					+ NameofEquipment + "'";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(".....entered.... into while");
				ProviderBean pb = new ProviderBean();

				pb.setprovider_name(rs.getString(1));
				pb.setmobile_no(rs.getString(2));
				pb.setproduct(rs.getString(3));
				pb.setmanufacturer_year(rs.getString(4));
				pb.setPincode(rs.getString(5));
				pb.setvillage(rs.getString(6));

				pb.setmandal(rs.getString(7));
				pb.setdistrict(rs.getString(8));
				pb.setstate(rs.getString(9));
				lis.add(pb);
			}
		} catch (Exception e) {

		}
		return lis;

	}

	public static List<TimeSlots> timeslots(int id) {
		Statement stmt = null;
		ResultSet rs;
		Connection conn = DBconnection.getConnection();
		List<TimeSlots> lis = new ArrayList<TimeSlots>();
		try {
			stmt = conn.createStatement();

			String query = "SELECT farmeaze.slot_table.from_date,farmeaze.slot_table.from_time,farmeaze.slot_table.to_date,farmeaze.slot_table.to_time "
					+ "FROM farmeaze.slot_table where provider_id=" + id + "";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(".....entered.... into while");
				TimeSlots pb = new TimeSlots();

				pb.setfromdate(rs.getString(1));
				pb.settodate(rs.getString(3));
				pb.setfromtime(rs.getString(2));
				pb.settotime(rs.getString(4));
				lis.add(pb);

			}
		} catch (Exception e) {

		}
		return lis;

	}

	public static void timeDB(String fd, String ft, String td, String tt, int id) {
		Connection conn = DBconnection.getConnection();
		Statement stmt;

		try {
			stmt = conn.createStatement();
			String Query = "INSERT INTO `farmeaze`.`slot_table` (`provider_id`, `from_date`, `from_time`, `to_date`, `to_time`) VALUES ('"
					+ id + "', '" + fd + "', '" + ft + "', '" + td + "', '" + tt + "');";
			stmt.executeUpdate(Query);
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static ArrayList<String> equip_dispaly() {

		Statement stmt = null;
		ResultSet rs;
		Connection conn = DBconnection.getConnection();
		ArrayList<String> lis = new ArrayList<>();
		try {
			stmt = conn.createStatement();

			String query = "SELECT farmeaze.list_of_equipments.eqp_name FROM farmeaze.list_of_equipments;";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String e1 = rs.getString(1);
				lis.add(e1);
			}
		} catch (Exception e) {

		}
		return lis;

	}
}