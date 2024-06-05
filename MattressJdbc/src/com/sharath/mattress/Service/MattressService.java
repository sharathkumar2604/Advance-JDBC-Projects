package com.sharath.mattress.Service;

import java.util.List;

import com.sharath.mattress.MattressDto;

public interface MattressService {
	
	public boolean saveAndSaveAll(MattressDto ... dto);
	
	public MattressDto readById(int id);
	
	public List<MattressDto> readAll();
	
	public List<MattressDto> readByName(String name);
	
	public boolean updatePriceAndMaterialByName(double price,String material,String name);

	public boolean deleteByName(String name);

}
