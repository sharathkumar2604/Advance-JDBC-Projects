package com.sharath.sqlcredentials;

public enum SqlCredentials {
	
	URL("jdbc:mysql://localhost:3306/JdbcProjectPractice"),USERNAME("root"),PASSWORD("Sathish@123@");
	
	private String value;

	private SqlCredentials(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	

}
