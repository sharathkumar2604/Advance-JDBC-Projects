package com.sharath.mobile.dto;

public class MobileDto {

	private int id;

	private String name;

	private String color;

	private int price;

	private String warranty;

	public MobileDto() {
		System.out.println("default constructor");
	}

	public MobileDto(int id, String name, String color, int price, String warranty) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.warranty = warranty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "MobileDto [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", warranty="
				+ warranty + ";" + " \n" ;
	}

}
