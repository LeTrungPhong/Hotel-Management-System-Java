package com.appManageHotel.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.appManageHotel.dao.DAOInterface;
import com.appManageHotel.database.ConnectDatabase;
import com.appManageHotel.models.room.Room;
import com.appManageHotel.models.service.Service;

public class RoomDAO implements DAOInterface<Room> {

	public static RoomDAO getInstance() {
		return new RoomDAO();
	}
	
	@Override
	public int insert(Room t) {
		try {
			
			Connection con = ConnectDatabase.getConnection();
			
			String sql = "INSERT INTO ROOM(IDRoom,CheckBoolean,MoneyOfRoom,TypeRoom)"
					+ " VALUES(?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, t.getIDRoom());
			pstmt.setBoolean(2, t.getCheck());
			pstmt.setInt(3, t.getMoney());
			pstmt.setString(4, t.getTypeRoom());
			
			int kq = pstmt.executeUpdate();
			
			System.out.println("Thuc thi: " + sql);
			System.out.println("Co" + kq + "Ket qua thay doi");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Room t) {
		try {
			
			Connection con = ConnectDatabase.getConnection();
			
			String sql = "UPDATE ROOM"
					+ " SET IDRoom = ?,"
					+ " CheckBoolean = ?,"
					+ " MoneyOfRoom = ?,"
					+ " TypeRoom = ?";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, t.getIDRoom());
			pstmt.setBoolean(2, t.getCheck());
			pstmt.setInt(3, t.getMoney());
			pstmt.setString(4, t.getTypeRoom());
			
			int kq = pstmt.executeUpdate();
			
			System.out.println("Thuc thi: " + pstmt.toString());
			System.out.println("Co" + kq + "Ket qua thay doi");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int delete(Room t) {
		try {
		
		Connection con = ConnectDatabase.getConnection();
		
		String sql = "DELETE FROM ROOM"
				+ " WHERE IDRoom = ?";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, t.getIDRoom());
		
		int kq = pstmt.executeUpdate();
		
		System.out.println("Thuc thi: " + pstmt.toString());
		System.out.println("Co" + kq + "Ket qua thay doi");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return 0;
	}

	@Override
	public ArrayList<Room> selectAll() {
		try {
		
		ArrayList<Room> result = new ArrayList<Room>(); 
		
		Connection con = ConnectDatabase.getConnection();
		
		String sql = "SELECT * FROM ROOM";
		
		PreparedStatement pstmt = con.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String IDRoom = rs.getString("IDRoom");
			Boolean Check = rs.getBoolean("CheckBoolean");
			int Money = rs.getInt("MoneyOfRoom");
			String TypeRoom = rs.getString("TypeRoom");
			result.add(new Room(IDRoom,Check,Money,TypeRoom));
		}
		
		System.out.println("Thuc thi: " + pstmt.toString());
		return result;
		
		} catch (Exception e) {
		e.printStackTrace();
		}
	
		return null;
	}

	@Override
	public Room selectByID(Room t) {
		try {
			Room result = null;
			Connection con = ConnectDatabase.getConnection();
			
			String sql = "SELECT * FROM ROOM"
					+ " WHERE IDService = ?";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, t.getIDRoom());
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String IDRoom = rs.getString("IDRoom");
				Boolean Check = rs.getBoolean("CheckofBoolean");
				int Money = rs.getInt("MoneyOfRoom");
				String TypeRoom = rs.getString("TypeRoom");
				result = new Room(IDRoom,Check,Money,TypeRoom);
			}
			
			System.out.println("Thuc thi: " + sql);
			return result;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public ArrayList<Room> selectByCondition(String Condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
