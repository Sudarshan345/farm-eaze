package Com.UserDetails;

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

	public static void provideradddata(String provider_name, String mobile_no, String product, String manufacturer_year,
			String Tractor, String Pincode, String village, String mandal, String district, String state) {
		Connection conn = DBConnection.getDBConnection();
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

	
	 public static List<ProviderBean> providerdetails(String NameofEquipment) {
		 Statement stmt = null;
	  ResultSet rs;
	  Connection conn = DBConnection.getDBConnection();
	  List<ProviderBean> lis = new ArrayList<ProviderBean>();
	  try { 
		  stmt = conn.createStatement();
			String query = "SELECT provider_name,mobile_no,product,manufacturer_year,Tractor,Pincode,village,mandal,district,state FROM farmeaze.provider_details p INNER join farmeaze.equipment_details e on p.provider_id = e.provider_id where e.NameofEquipment ='"+ NameofEquipment+"'";
			rs = stmt.executeQuery(query);
	  while(rs.next()) {
		  ProviderBean pb = new ProviderBean();

		  pb.setprovider_name(rs.getString(1));
		  pb.setmobile_no(rs.getString(2));
		pb.setproduct(rs.getString(3));
		pb.setmanufacturer_year(rs.getString(4));
		pb.setTractor(rs.getString(5));
		pb.setPincode(rs.getString(6));
		pb.setvillage(rs.getString(7));
	
		pb.setmandal(rs.getString(8));
		pb.setdistrict(rs.getString(9));
		pb.setstate(rs.getString(10));
		  lis.add(pb);
	  }
	  } catch (Exception e) { 
		  
	  }
	return lis;
	  }
	 public static List<ProviderBean> retriveprovider() {
		 Statement stmt = null;
	  ResultSet rs;
	  Connection conn = DBConnection.getDBConnection();
	  List<ProviderBean> lis = new ArrayList<ProviderBean>();
	  try { 
		  stmt = conn.createStatement();
			String query = "SELECT * FROM farmeaze.provider_details";
			rs = stmt.executeQuery(query);
	  while(rs.next()) {
		  ProviderBean pb = new ProviderBean();

		  pb.setprovider_name(rs.getString(2));
		  pb.setmobile_no(rs.getString(3));
		pb.setproduct(rs.getString(4));
		pb.setmanufacturer_year(rs.getString(5));
		pb.setTractor(rs.getString(6));
		pb.setPincode(rs.getString(7));
		pb.setvillage(rs.getString(8));
	
		pb.setmandal(rs.getString(9));
		pb.setdistrict(rs.getString(10));
	/*	pb.setstate(rs.getString(10));*/
		  lis.add(pb);
		  System.out.println(pb);
	  }
	  } catch (Exception e) { 
		  
	  }
	return lis;
	  }
	public static int getProviderId(String provider_name,String mobile_no){
		Connection conn = DBConnection.getDBConnection();
		Statement stmt = null;
		ResultSet rs;
		int pid=0;
		
		try {
			String query = "SELECT provider_id FROM farmeaze.provider_details where provider_name='"+provider_name+"' and mobile_no='"+mobile_no+"'";
	stmt=conn.createStatement();
			rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			
			
			 pid =rs.getInt(1);
			
			
			//System.out.println(pid);
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return pid;
		
	}
	 public static List<EquipmentBean> retriveequipmentbaseprovider(int provider_id) {
		 Statement stmt = null;
	  ResultSet rs;
	  Connection conn = DBConnection.getDBConnection();
	  List<EquipmentBean> lis = new ArrayList<EquipmentBean>();
	  try { 
		  stmt = conn.createStatement();
			String query = "SELECT * FROM farmeaze.equipment_details where provider_id='"+provider_id+"'";
			rs = stmt.executeQuery(query);
	  while(rs.next()) {
		
		EquipmentBean eb= new EquipmentBean();
		eb.setNameofEquipment(rs.getString(2));
		eb.setDescription(rs.getString(3));
		lis.add(eb);
		System.out.println(eb);
	  }
	  } catch (Exception e) { 
		  
	  }
	return lis;
	  }
}
