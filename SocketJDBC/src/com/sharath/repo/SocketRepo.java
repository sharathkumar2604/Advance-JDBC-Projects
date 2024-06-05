
package com.sharath.repo;

import java.util.List;

import com.sharath.dto.SocketDto;

public interface SocketRepo {

	
	public boolean saveAndSaveAll(SocketDto ...dto);
	
	
	public List<SocketDto> readAll();
	
	public List<SocketDto> readByColor(String color);
	
	
	public List<SocketDto> updatePriceByNameAndColor(int price,String name ,String color);
	
	
	public String deleteByName(String name);
	
	
}
