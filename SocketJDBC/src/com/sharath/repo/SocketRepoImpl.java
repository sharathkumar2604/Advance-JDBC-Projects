package com.sharath.repo;

import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sharath.Dbutils.DbutilsClass;
import com.sharath.dto.SocketDto;

public class SocketRepoImpl implements SocketRepo {

	@Override
	public boolean saveAndSaveAll(SocketDto... dto) {
		try {
			Connection con = DbutilsClass.getConnection();
			PreparedStatement statement = con.prepareStatement("insert into socket values(?,?,?,?,?)");
			int count = 0;
			for (SocketDto d : dto) {
				statement.setInt(1, d.getId());
				statement.setString(2, d.getName());
				statement.setString(3, d.getColor());
				statement.setInt(4, d.getNoOfPins());
				statement.setInt(5, d.getPrice());
				statement.executeUpdate();
				System.out.println(d);

				count++;
			}
			System.out.println("\033[0;1m" + count + "date saved to database successfully");
			return true;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;
	}

	@Override
	public List<SocketDto> readAll() {

		try {
			Connection con = DbutilsClass.getConnection();
			PreparedStatement statement = con.prepareStatement("select * from socket");

			ResultSet query = statement.executeQuery();
			List<SocketDto> list = new ArrayList<SocketDto>();

			while (query.next()) {
				int id1 = query.getInt(1);
				String name1 = query.getString(2);
				String color1 = query.getString(3);
				int noOfPins1 = query.getInt(4);
				int price1 = query.getInt(5);

				SocketDto d1 = new SocketDto(id1, name1, color1, noOfPins1, price1);
				list.add(d1);

			}
			return list;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

//=============================================two ways readByColor==================================
	// -------------------------------1st way is
	// below================================================
	@Override
	public List<SocketDto> readByColor(String color) {

		List<SocketDto> l = readAll();
		List<SocketDto> result = new ArrayList<SocketDto>();
		for (SocketDto ss : l) {
			if (color.equalsIgnoreCase(ss.getColor())) {
				result.add(ss);
			}
		}
		return result;
	}

	// =================or==========================================
	// -------------------------------2nd way is
	// below-----------------------------------------
//	public List<SocketDto> readByColor(String color) {
//        List<SocketDto> ls = new ArrayList<>();
//
//        try {
//            Connection con = DbutilsClass.getConnection();
//            PreparedStatement statement = con.prepareStatement("SELECT * FROM socket WHERE color = ?");
//            statement.setString(1, color);
//
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//            	SocketDto socket = new SocketDto();
//                socket.setId(resultSet.getInt("id"));
//                socket.setColor(resultSet.getString("color"));
//                socket.setName(resultSet.getString("name"));
//                socket.setNoOfPins(resultSet.getInt("noOfPins"));
//                socket.setPrice(resultSet.getInt("price"));
//                ls.add(socket);
//            }
//            return ls;
//
//            
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }

	@Override
	public List<SocketDto> updatePriceByNameAndColor(int price, String name, String color) {
		List<SocketDto> lis = readAll();
		List ss = new ArrayList<SocketDto>();

		try {
			Connection con = DbutilsClass.getConnection();
			PreparedStatement statement = con.prepareStatement("update socket set price=? where name=? and color=?");

			for (SocketDto d : lis) {
				if (name.equalsIgnoreCase(d.getName()) && color.equalsIgnoreCase(d.getColor())) {
					ss.add(d);
					statement.setInt(1, price);
					statement.setString(2, name);
					statement.setString(3, color);
					statement.executeUpdate();
				}
			}

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ss;

	}

	@Override
	public String deleteByName(String name) {
		try {
			Connection con = DbutilsClass.getConnection();
			PreparedStatement statement = con.prepareStatement("delete from socket where name =?");
			statement.setString(1, name);
			statement.executeUpdate();
			return "deleted successfully";
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

}
