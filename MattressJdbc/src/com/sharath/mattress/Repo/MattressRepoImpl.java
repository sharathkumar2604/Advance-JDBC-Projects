package com.sharath.mattress.Repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sharath.mattress.MattressDto;
import com.sharath.mattress.Dbutils.MattressDbutils;

public class MattressRepoImpl implements MattressRepo {

	@Override
	public boolean saveAndSaveAll(MattressDto... dto) {
		try {

			Connection con = MattressDbutils.getConnection();

			PreparedStatement statement = con.prepareStatement("insert into mattress values(?,?,?,?,?)");

			for (MattressDto d : dto) {
				statement.setInt(1, d.getId());
				statement.setString(2, d.getName());
				statement.setString(3, d.getSize());
				statement.setString(4, d.getMaterial());
				statement.setDouble(5, d.getPrice());
				statement.execute();
			}
			return true;
		} catch (Exception e) {

		}
		return false;
	}

	@Override
	public MattressDto readById(int id) {

		try {
			Connection con = MattressDbutils.getConnection();
			PreparedStatement statement = con.prepareStatement("select * from mattress where id =?");
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			List<MattressDto> l = new ArrayList<MattressDto>();

			while (resultSet.next()) {
				int ids = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String size = resultSet.getString(3);
				String material = resultSet.getString(4);
				double price = resultSet.getDouble(5);
				MattressDto d = new MattressDto(ids, name, size, material, price);
				statement.close();
				return d;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	@Override
	public List<MattressDto> readAll() {
		try {
			Connection con = MattressDbutils.getConnection();
			PreparedStatement statement = con.prepareStatement("select * from mattress ");

			ResultSet resultSet = statement.executeQuery();
			List<MattressDto> l = new ArrayList<MattressDto>();

			while (resultSet.next()) {
				int ids = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String size = resultSet.getString(3);
				String material = resultSet.getString(4);
				double price = resultSet.getDouble(5);
				MattressDto d = new MattressDto(ids, name, size, material, price);
				l.add(d);
//				statement.close();

			}
			return l;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	@Override
	public List<MattressDto> readByName(String name) {

		try {
			Connection con = MattressDbutils.getConnection();
			PreparedStatement statement = con.prepareStatement("select * from mattress where name =?");
			statement.setString(1,name);
			ResultSet resultSet = statement.executeQuery();
			List<MattressDto> l = new ArrayList<MattressDto>();

			while (resultSet.next()) {
				int ids = resultSet.getInt(1);
				String nameq = resultSet.getString(2);
				String size = resultSet.getString(3);
				String material = resultSet.getString(4);
				double price = resultSet.getDouble(5);
				MattressDto d = new MattressDto(ids, nameq, size, material, price);
				l.add(d);
//				statement.close();
			}
			return l;

		} catch (Exception e) {
			// TODO: handle exception
		}

		
		
		return null;
	}

	@Override
	public boolean updatePriceAndMaterialByName(double price, String material, String name) {

		try {
			Connection con = MattressDbutils.getConnection();
			PreparedStatement statement = con.prepareStatement("update mattress set price =? ,material=? where name=?");
			statement.setDouble(1,price);
			statement.setString(2,material);
			statement.setString(3,name);
			
			statement.executeUpdate();
		
			statement.close();
			return true;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
try {
		Connection con = MattressDbutils.getConnection();
		PreparedStatement statement = con.prepareStatement("delete from mattress where name =?");
		statement.setString(1, name);
		statement.executeUpdate();
		return true;
		
}
catch (Exception e) {
	// TODO: handle exception
}
		return false;
	}

}
