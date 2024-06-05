package com.sharath.pencilRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sharath.pencilDto.PencilDto;
import com.sharath.pencilDto.PencilSqlCredentials;

public class PencilRepoImpl implements PencilRepo {

	@Override
	public boolean save(PencilDto dto) {

		try {
			Connection con = PencilSqlCredentials.getConnection();
			PreparedStatement statement = con.prepareStatement("insert into pencildto values(?,?,?,?,?)");

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getMm());
			statement.setString(4, dto.getType());
			statement.setInt(5, dto.getPrice());
			statement.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public boolean saveAll(PencilDto... dto) {

		try {
			Connection con = PencilSqlCredentials.getConnection();
			PreparedStatement statement = con.prepareStatement("insert into pencildto values(?,?,?,?,?)");
			for (PencilDto d : dto) {

				statement.setInt(1, d.getId());
				statement.setString(2, d.getName());
				statement.setString(3, d.getMm());
				statement.setString(4, d.getMm());
				statement.setInt(5, d.getPrice());
				statement.execute();

			}

			System.out.println("sucessfull");
			return true;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;
	}

	@Override
	public List<PencilDto> readAll() {

		try {
			Connection con = PencilSqlCredentials.getConnection();
			PreparedStatement statement = con.prepareStatement("select * from pencildto");
			ResultSet query = statement.executeQuery();
			List<PencilDto> list = new ArrayList<PencilDto>();
			while (query.next()) {
				int id1 = query.getInt(1);
				String name1 = query.getString(2);
				String mm1 = query.getString(3);
				String type1 = query.getString(4);
				int price = query.getInt(5);

				PencilDto d = new PencilDto(id1, name1, mm1, type1, price);
				list.add(d);
			}

			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	@Override
	public List<PencilDto> readByName(String name) {
		List<PencilDto> list = new ArrayList<PencilDto>();

		try {
			Connection con = PencilSqlCredentials.getConnection();
			PreparedStatement statement = con.prepareStatement("select * from pencildto where name=?");
			statement.setString(1, name);
			ResultSet query = statement.executeQuery();
			while (query.next()) {
				PencilDto dto = new PencilDto();
				dto.setId(query.getInt(1));
				dto.setName(query.getString(2));
				dto.setMm(query.getString(3));
				dto.setType(query.getString(4));
				dto.setPrice(query.getInt(5));
				list.add(dto);

			}
			return list;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	@Override
	public List<PencilDto> readById(int... id) {
		List<PencilDto> list = new ArrayList<PencilDto>();
		try {
			Connection con = PencilSqlCredentials.getConnection();
			PreparedStatement statement = con.prepareStatement("select * from pencildto where id=?");
			for (int i : id) {

				statement.setInt(1, i);
				ResultSet query = statement.executeQuery();
				while (query.next()) {
					int id1 = query.getInt(1);
					String name1 = query.getString(2);
					String mm1 = query.getString(3);
					String type1 = query.getString(4);
					int price = query.getInt(5);

					PencilDto d = new PencilDto(id1, name1, mm1, type1, price);
					list.add(d);
				}
			}
			return list;
		}

		catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public String updatePriceByName(int price, String name) {

		try {
			Connection con = PencilSqlCredentials.getConnection();
			PreparedStatement statement = con.prepareStatement("update pencildto set price=? where name=? ");
			statement.setInt(1, price);
			statement.setString(2, name);
			statement.executeUpdate();
			return "updated successfully";
		} catch (Exception e) {
			// TODO: handle exception
		}

		return "Not updated its failed!";
	}
//	@Override
//	public String deleteByNamePriceAndMm(String name, int price, String mm) {
//		try {
//			Connection con = PencilSqlCredentials.getConnection();
//			PreparedStatement statement = con.prepareStatement("delete from pencildto where name=? and price=? and mm=? ");
//			
//				statement.setString(1, name);
//				statement.setInt(2, price);
//				statement.setString(3, mm);
//				statement.executeUpdate();
//			 
//
//			
//			return "deleted successfully";
//		} catch (Exception e) {
//			System.out.println("please enter propely with same data");
//			// TODO: handle exception
//		}
//
//		return "Not deleted its failed!";
//	}

//================================or deleteByNamePriceAndMm========================
	@Override
	public String deleteByNamePriceAndMm(String name, int price, String mm) {
	    try {
	        Connection con = PencilSqlCredentials.getConnection();

	        // First, select the record to show what will be deleted
	        PreparedStatement selectStatement = con.prepareStatement(
	            "SELECT id, name, mm, type, price FROM pencildto WHERE name=? AND price=? AND mm=?"
	        );
	        selectStatement.setString(1, name);
	        selectStatement.setInt(2, price);
	        selectStatement.setString(3, mm);

	        ResultSet resultSet = selectStatement.executeQuery();

	        if (resultSet.next()) {
	            // Retrieve the specific columns before deletion
	            int id = resultSet.getInt("id");
	            String retrievedName = resultSet.getString("name");
	            String retrievedMm = resultSet.getString("mm");
	            String retrievedType = resultSet.getString("type");
	            int retrievedPrice = resultSet.getInt("price");

	            // Prepare the delete statement
	            PreparedStatement deleteStatement = con.prepareStatement(
	                "DELETE FROM pencildto WHERE name=? AND price=? AND mm=?"
	            );
	            deleteStatement.setString(1, name);
	            deleteStatement.setInt(2, price);
	            deleteStatement.setString(3, mm);

	            deleteStatement.executeUpdate();

	            return String.format(
	                "Deleted successfully: id=%d, name=%s, mm=%s, type=%s, price=%d",
	                id, retrievedName, retrievedMm, retrievedType, retrievedPrice
	            );
	        } else {
	            return "No matching records found";
	        }
	    } catch (Exception e) {
	        e.printStackTrace(); // Optionally print the stack trace for debugging purposes
	        return "Deletion failed!";
	    }
	}

}
