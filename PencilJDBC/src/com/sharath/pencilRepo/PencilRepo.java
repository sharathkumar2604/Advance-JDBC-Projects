package com.sharath.pencilRepo;


import java.util.List;

import com.sharath.pencilDto.PencilDto;

public interface PencilRepo {
	
	
	public boolean save(PencilDto dto);
	
	public boolean saveAll(PencilDto...dto);
	
	
	public List<PencilDto> readAll();
	
	public List<PencilDto> readByName(String name);
	
	
	public List<PencilDto> readById(int...id);
	
	
	public String updatePriceByName(int price,String name);
	
	public String deleteByNamePriceAndMm(String name,int price,String mm);
	

}
