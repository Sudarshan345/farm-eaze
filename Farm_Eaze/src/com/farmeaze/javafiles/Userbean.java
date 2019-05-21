package com.reg.servlets;

public class Userbean {
	int user_id;
	String user_name;
	String mobile_number;
	String pincode;
	String village;

	public int getuser_id() {
		return user_id;
	}

	public void setuser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getuser_name() {
		return user_name;
	}

	public void setuser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getmobile_number() {
		return mobile_number;
	}

	public void setmobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getpincode() {
		return pincode;
	}

	public void setpincode(String pincode) {
		this.pincode = pincode;
	}

	public String getvillage() {
		return village;
	}

	public void setvillage(String village) {
		this.village = village;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
