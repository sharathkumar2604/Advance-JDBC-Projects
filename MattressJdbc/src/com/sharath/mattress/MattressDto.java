package com.sharath.mattress;

public class MattressDto {
	
	private int id ;
	
	private String name;
	
	private String size;
	
	private String material;
	
	private double price;

	public MattressDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MattressDto(int id, String name, String size, String material, double price) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.material = material;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MattressDto [id=" + id + ", name=" + name + ", size=" + size + ", material=" + material + ", price="
				+ price + "\n";
	}
	
	
		

}
