package com.appManageHotel.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.appManageHotel.models.people.Customer;
import com.appManageHotel.database.ConnectDatabase;
import com.appManageHotel.models.time.Date;

public class CustomerDAO implements DAOInterface<Customer> {
	
	public static CustomerDAO getInstance() {
		return new CustomerDAO();
	}
	
	@Override
	public int insert(Customer t) {
		
		try {
			Connection con = ConnectDatabase.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "INSERT INTO CUSTOMER (CCCD,FullName,Birth,Boolean,Times)"
						+ " VALUES ('"+ t.getCCCD() +"','"+ t.getName() + "','" + t.getStringDate() + "'," + t.getCheck() + "," + t.gettimes() + ")";
					
			int ketqua = st.executeUpdate(sql);
			
			System.out.println("Thuc thi : " + sql);
			System.out.println("Co : " + ketqua + "thay doi");
			ConnectDatabase.closeConnection(con);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Customer t) {
		try {
			Connection con = ConnectDatabase.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "UPDATE CUSTOMER "
						+ "SET CCCD = '" + t.getCCCD() + "',"
						+ " FullName = '" + t.getName() + "',"
						+ " Birth = '" + t.getStringDate() + "',"
						+ " Boolean = " + t.getCheck() + ","
						+ " Times = " + t.gettimes() + ""
						+ "WHERE CCCD = '" + t.getCCCD() + "'"
						;
					
			int ketqua = st.executeUpdate(sql);
			
			System.out.println("Thuc thi : " + sql);
			System.out.println("Co : " + ketqua + "thay doi");
			ConnectDatabase.closeConnection(con);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Customer t) {
		try {
			Connection con = ConnectDatabase.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "DELETE FROM CUSTOMER "
						+ "WHERE CCCD = '" + t.getCCCD() + "'"
						;
					
			int ketqua = st.executeUpdate(sql);
			
			System.out.println("Thuc thi : " + sql);
			System.out.println("Co : " + ketqua + "thay doi");
			ConnectDatabase.closeConnection(con);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<Customer> selectAll() {
		try {
			ArrayList<Customer> result = new ArrayList<Customer>();
			Connection con = ConnectDatabase.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "SELECT * FROM CUSTOMER ";
					
			// nhu table
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String CCCD = rs.getString("CCCD");
				String Name = rs.getString("FullName");
				String Date = rs.getString("Birth");
				int day = Integer.parseInt(Date.substring(8, 9));
				int month = Integer.parseInt(Date.substring(5, 6));
				int year = Integer.parseInt(Date.substring(0, 3));
				boolean Check = rs.getBoolean("Boolean");
				int times = rs.getInt("Times");
				result.add(new Customer(CCCD,Name,new Date(day,month,year),times,Check));
			}
			
			System.out.println("Thuc thi : " + sql);
			ConnectDatabase.closeConnection(con);
			return result;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Customer selectByID(Customer t) {
		try {
			Customer result = null;
			Connection con = ConnectDatabase.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "SELECT * FROM CUSTOMER "
					     + " WHERE CCCD = '" + t.getCCCD() + "'";
					
			// nhu table
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String CCCD = rs.getString("CCCD");
				String Name = rs.getString("FullName");
				String Date = rs.getString("Birth");
				int day = Integer.parseInt(Date.substring(8, 9));
				int month = Integer.parseInt(Date.substring(5, 6));
				int year = Integer.parseInt(Date.substring(0, 3));
				boolean Check = rs.getBoolean("Boolean");
				int times = rs.getInt("Times");
				result = new Customer(CCCD,Name,new Date(day,month,year),times,Check);
			}
			
			System.out.println("Thuc thi : " + sql);
			ConnectDatabase.closeConnection(con);
			return result;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Customer> selectByCondition(String Condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
