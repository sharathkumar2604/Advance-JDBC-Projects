package com.sharath.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sharath.dbutils.Dbutils;
import com.sharath.dto.MobileDto;

public class MobileRepoImpl implements MobileRepo {

	Connection con = Dbutils.get();

	@Override
	public boolean saveAndSaveAll(MobileDto... dtos) {

		List<MobileDto> l = new ArrayList<MobileDto>();

		try {
			PreparedStatement statement = con.prepareStatement("insert into mobileDto values(?,?,?,?)");
			for (MobileDto d : dtos) {
				statement.setInt(1, d.getId());
				statement.setString(2, d.getName());
				statement.setString(3, d.getColor());
				statement.setInt(4, d.getPrice());

				statement.execute();
				l.add(d);

			}

			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public List<MobileDto> readAll() {
		List<MobileDto> readAll = new ArrayList<MobileDto>();

		try {
			PreparedStatement statement = con.prepareStatement("select * from mobileDto");

			ResultSet query = statement.executeQuery();

			while (query.next()) {
				int id1 = query.getInt(1);
				String name1 = query.getString(2);
				String color1 = query.getString(2);
				int price1 = query.getInt(4);

				MobileDto d = new MobileDto(id1, name1, color1, price1);
				readAll.add(d);

			}
			return readAll;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	@Override
	public List<MobileDto> readByName(String... name) {

		List<MobileDto> readByName = readAll();
		List<MobileDto> read = new ArrayList<MobileDto>();

		for (String na : name) {
			for (MobileDto d : readByName) {
				if (d.getName().equalsIgnoreCase(na)) {
					read.add(d);
				}
			}
		}

		return read;
	}

	@Override
	public List<MobileDto> readById(int... id) {
		List<MobileDto> readByName = readAll();
		List<MobileDto> read = new ArrayList<MobileDto>();

		for (int na : id) {
			for (MobileDto d : readByName) {
				if (d.getId() == na) {
					read.add(d);
				}
			}
		}

		return read;
	}

	@Override
	public boolean updatePriceByName(int price, String name) {

		try {
			PreparedStatement statement = con.prepareStatement("update mobileDto set price=? where name=?");
			statement.setInt(1, price);
			statement.setString(2, name);
			int rowsUpdated = statement.executeUpdate();

			return (rowsUpdated > 0) ;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;

	}

	@Override
	public boolean deleteByName(String name) {
		try {
			PreparedStatement statement = con.prepareStatement("delete from  mobileDto where name=?");
			statement.setString(1, name);
			int rowsUpdated = statement.executeUpdate();

			return (rowsUpdated > 0) ;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;

	}

}
