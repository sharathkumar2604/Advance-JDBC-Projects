package com.sharath.mattress.Service;

import java.util.List;

import com.sharath.mattress.MattressDto;
import com.sharath.mattress.Repo.MattressRepo;
import com.sharath.mattress.Repo.MattressRepoImpl;

public class MattressServiceImpl implements MattressService {

	MattressRepo repo = new MattressRepoImpl();
	
	@Override
	public boolean saveAndSaveAll(MattressDto ... dto) {
		return repo.saveAndSaveAll(dto);
	}

	@Override
	public MattressDto readById(int id) {
		return repo.readById(id);
	}

	@Override
	public List<MattressDto> readAll() {
		return repo.readAll();
	}

	@Override
	public List<MattressDto> readByName(String name) {
		// TODO Auto-generated method stub
		return repo.readByName(name);
	}

	@Override
	public boolean updatePriceAndMaterialByName(double price, String material, String name) {
		// TODO Auto-generated method stub
		return repo.updatePriceAndMaterialByName(price,material,name);
	}

	@Override
	public boolean deleteByName(String name) {
		// TODO Auto-generated method stub
		return repo.deleteByName(name);
	}

}
