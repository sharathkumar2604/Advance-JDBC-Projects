package com.sharath.sqlCredentials;

public enum SqlCredentials {
	
	URL("jdbc:mysql://localhost:3306/JdbcProjectPractice"),USERNAME("root"),PASSWORD("Sathish@123@");
	
	private  String value;
	
	private SqlCredentials(String name)
	{
		this.value = name;
	}

	public String getValue() {
		return value;
	}
	
	

}
