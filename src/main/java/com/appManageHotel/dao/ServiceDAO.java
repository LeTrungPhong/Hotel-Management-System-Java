package com.appManageHotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.appManageHotel.models.service.Service;
import com.appManageHotel.database.ConnectDatabase;

public class ServiceDAO implements DAOInterface<Service> {

	public static ServiceDAO getInstance() {
		return new ServiceDAO();
	}
	
	@Override
	public int insert(Service t) {
		try {
			
			Connection con = ConnectDatabase.getConnection();
			
			String sql = "INSERT INTO SERVICEOFHOTEL(IDService,NameService,MoneyService,InformationService)"
					+ " VALUES(?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, t.getIDService());
			pstmt.setString(2, t.getNameService());
			pstmt.setInt(3, t.getMoneyService());
			pstmt.setString(4, t.getInformationService());
			
			int kq = pstmt.executeUpdate();
			
			System.out.println("Thuc thi: " + sql);
			System.out.println("Co" + kq + "Ket qua thay doi");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int update(Service t) {
		try {
			
			Connection con = ConnectDatabase.getConnection();
			
			String sql = "UPDATE SERVICEOFHOTEL"
					+ " SET IDService = ?,"
					+ " NameService = ?,"
					+ " MoneyService = ?,"
					+ " InformationService = ?"
					+ " WHERE IDService = ?";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, t.getIDService());
			pstmt.setString(2, t.getNameService());
			pstmt.setInt(3, t.getMoneyService());
			pstmt.setString(4, t.getInformationService());
			pstmt.setString(5, t.getIDService());
			
			int kq = pstmt.executeUpdate();
			
			System.out.println("Thuc thi: " + pstmt.toString());
			System.out.println("Co" + kq + "Ket qua thay doi");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int delete(Service t) {
		try {
			
			Connection con = ConnectDatabase.getConnection();
			
			String sql = "DELETE FROM SERVICEOFHOTEL"
					+ " WHERE IDService = ?";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, t.getIDService());
			
			int kq = pstmt.executeUpdate();
			
			System.out.println("Thuc thi: " + pstmt.toString());
			System.out.println("Co" + kq + "Ket qua thay doi");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public ArrayList<Service> selectAll() {
		try {
			
			ArrayList<Service> result = new ArrayList<Service>(); 
			
			Connection con = ConnectDatabase.getConnection();
			
			String sql = "SELECT * FROM SERVICEOFHOTEL";
			
			PreparedStatement pstmt = con.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String IDService = rs.getString("IDService");
				String NameService = rs.getString("NameService");
				int MoneyService = rs.getInt("MoneyService");
				String InformationService = rs.getString("InformationService");
				result.add(new Service(IDService,NameService,MoneyService,InformationService));
			}
			
			System.out.println("Thuc thi: " + pstmt.toString());
			return result;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Service selectByID(Service t) {
		
		try {
			Service result = null;
			Connection con = ConnectDatabase.getConnection();
			
			String sql = "SELECT * FROM SERVICEOFHOTEL"
					+ " WHERE IDService = ?";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, t.getIDService());
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String IDService = rs.getString("IDService");
				String NameService = rs.getString("NameService");
				int MoneyService = rs.getInt("MoneyService");
				String InformationService = rs.getString("InformationService");
				result = new Service(IDService,NameService,MoneyService,InformationService);
			}
			
			System.out.println("Thuc thi: " + sql);
			return result;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public ArrayList<Service> selectByCondition(String Condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
