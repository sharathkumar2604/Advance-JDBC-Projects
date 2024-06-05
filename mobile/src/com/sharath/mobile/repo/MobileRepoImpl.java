
package com.sharath.mobile.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sharath.mobile.dbutils.MobileUtils;
import com.sharath.mobile.dto.MobileDto;

public class MobileRepoImpl implements MobileRepo {

	@Override
	public boolean save(MobileDto dto) {
		try {
			Connection con = MobileUtils.getConnection();
			PreparedStatement statement = con.prepareStatement("insert into mobile values(?,?,?,?,?)");
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColor());
			statement.setInt(4, dto.getPrice());
			statement.setString(5, dto.getWarranty());
			statement.executeUpdate();

			System.out.println("vhgfhgfhj");
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}

		return false;
	}

	@Override
	public boolean saveAll(List<MobileDto> list) {

		try (Connection con = MobileUtils.getConnection();
				PreparedStatement statement = con.prepareStatement("insert into mobile values(?,?,?,?,?)");) {

			for (MobileDto dto : list) {
				statement.setInt(1, dto.getId());
				statement.setString(2, dto.getName());
				statement.setString(3, dto.getColor());
				statement.setInt(4, dto.getPrice());
				statement.setString(5, dto.getWarranty());
				statement.executeUpdate();
			}
			System.out.println(list);
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}

		return false;
	}

	@Override
	public List<MobileDto> readAll() {
		try (Connection con = MobileUtils.getConnection();
				PreparedStatement statement = con.prepareStatement("select * from  mobile");) {

			ResultSet set = statement.executeQuery();
			List<MobileDto> ne = new ArrayList<MobileDto>();
			while (set.next()) {

				int id = set.getInt(1);
				String name = set.getString(2);
				String color = set.getString(3);
				int price = set.getInt(4);
				String warranty = set.getString(5);

				MobileDto dto = new MobileDto(id, name, color, price, warranty);
				ne.add(dto);
			}
			return ne;

		} catch (Exception e) {
		}
		return null;

	}

	@Override
	public List<MobileDto> readById(int... id) {
		try (Connection con = MobileUtils.getConnection();
				PreparedStatement statement = con.prepareStatement("select * from  mobile where id =?");) {
			List<MobileDto> ne = new ArrayList<MobileDto>();

			for (int d : id) {
				statement.setInt(1, d);
				ResultSet set = statement.executeQuery();
				while (set.next()) {

					int id1 = set.getInt(1);
					String name = set.getString(2);
					String color = set.getString(3);
					int price = set.getInt(4);
					String warranty = set.getString(5);

					MobileDto dto = new MobileDto(id1, name, color, price, warranty);
					ne.add(dto);
				}
			}
			return ne;

		} catch (Exception e) {
		}
		return null;

	}

	@Override
		public String updateNameAndPriceByColor(String name, int price, String color) {
		try (Connection con = MobileUtils.getConnection();
				PreparedStatement statement = con.prepareStatement("update mobile set name=?,price=? where color=?");) {

			statement.setString(1, name);
			statement.setInt(2, price);
			statement.setString(3, color);
			statement.executeUpdate();
			return "updated sucessfully";

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	@Override
	public String deleteByNamePriceAndColor(String name, int price, String color) {
		try (Connection con = MobileUtils.getConnection();
				PreparedStatement statement = con
						.prepareStatement("delete from  mobile where name=? and price=? and color=?");) {
			statement.setString(1, name);
			statement.setInt(2, price);
			statement.setString(3, color);
			statement.executeUpdate();
			return " deleted successfully";

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
