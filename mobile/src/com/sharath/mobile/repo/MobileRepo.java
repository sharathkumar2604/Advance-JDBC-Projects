package com.sharath.mobile.repo;

import java.util.List;

import com.sharath.mobile.dto.MobileDto;

public interface MobileRepo {

	public boolean save(MobileDto dto);

	public boolean saveAll(List<MobileDto> list);

	public List<MobileDto> readAll();

	public List<MobileDto> readById(int ... id);

	public String updateNameAndPriceByColor(String name, int price, String color);

	public String deleteByNamePriceAndColor(String name, int price, String color);

}
