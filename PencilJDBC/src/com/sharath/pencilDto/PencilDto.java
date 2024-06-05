package com.sharath.pencilDto;

public class PencilDto {

	private int id;

	private String name;

	private String mm;

	private String type;

	private int price;

	public PencilDto() {
	}

	public PencilDto(int id, String name, String mm, String type, int price) {
		this.id = id;
		this.name = name;
		this.mm = mm;
		this.type = type;
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

	public String getMm() {
		return mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PencilDto [id=" + id + ", name=" + name + ", mm=" + mm + ", type=" + type + ", price=" + price + "]";
	}

}
