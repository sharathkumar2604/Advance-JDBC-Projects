package com.sharath.mobile.service;

import java.util.List;

import com.sharath.mobile.dto.MobileDto;
import com.sharath.mobile.repo.MobileRepo;
import com.sharath.mobile.repo.MobileRepoImpl;

public class MobileServiceImpl implements MobileService {

	MobileRepo repo = new MobileRepoImpl();

	@Override
	public boolean save(MobileDto dto) {

		if (dto.getId() > 0) {
			if (dto.getName().length() >= 2) {
				if (dto.getColor().length() > 2) {
					if (dto.getPrice() > 999) {
						if (dto.getWarranty().length() <= 1) {
							return repo.save(dto);

						}
					}
				}
			}
		}

		System.out.println("hskjdhk");
		return false;
	}

	@Override
	public boolean saveAll(List<MobileDto> list) {

		return repo.saveAll(list);
	}

	@Override
	public List<MobileDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public List<MobileDto> readById(int... id) {
		return repo.readById(id);
	}

	@Override
	public String updateNameAndPriceByColor(String name, int price, String color) {
		// TODO Auto-generated method stub
		return repo.updateNameAndPriceByColor(name,price,color);
	}

	@Override
	public String deleteByNamePriceAndColor(String name, int price, String color) {
		// TODO Auto-generated method stub
		
		return repo.deleteByNamePriceAndColor(name,price,color);
	}


}
