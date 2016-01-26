package com.lxl.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseCon {
	
	private static final String DBDRIVER = "com.ibm.db2.jcc.DB2Driver";
	private static final String DBURL = "jdbc:db2://130.1.9.228:50000/ebanksit"; 
	private static final String DBUSER = "db2inst2";
	private static final String DBPASS = "db2inst2";
	private static Connection conn = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	
	public static void getConnection() throws SQLException{
		try{
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
			String sql = "select count(*) from userlogin";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1));
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			rs.close();
			pstmt.close();
			conn.close();
		}
	}
	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		getConnection();
	}

}
