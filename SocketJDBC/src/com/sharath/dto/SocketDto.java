package com.sharath.dto;

public class SocketDto {

	private int id;

	private String name;

	private String color;

	private int noOfPins;

	private int price;

	public SocketDto() {
      
	}

	public SocketDto(int id, String name, String color, int noOfPins, int price) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.noOfPins = noOfPins;
		this.price = price;
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

	public int getNoOfPins() {
		return noOfPins;
	}

	public void setNoOfPins(int noOfPins) {
		this.noOfPins = noOfPins;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SocketDto [id=" + id + ", name=" + name + ", color=" + color + ", noOfPins=" + noOfPins + ", price="
				+ price + "]";
	}

}
