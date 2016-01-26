package com.lxl.DBbase;

import java.sql.Connection;

public class TestForDb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatabaseConnection dc = new DatabaseConnection();
			Connection con = dc.getConnection();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
