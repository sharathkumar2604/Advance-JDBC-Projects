package com.sharath.mobile.sqlCredentials;

public enum SqlCredentials {

	URL("jdbc:mysql://localhost:3306/MobileStore"), USERNAME("root"), PASSWORD("Sathish@123@");

	private String value;

	private SqlCredentials(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
