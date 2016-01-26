package com.lxl.database;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DatabaseConnection {
	/**
	 * ��ݿ�������
	 * @author lxl
	 */
	// ����JNDI�Ĳ������
	private static final String DSNAME = "java:comp/env/jdbc/mysql";
	
	private Connection conn =null;
	
	/**
	 * ���췽�� ������ݿ�����
	 * @throws Exception
	 */
	public DatabaseConnection() throws Exception{
		try{
			//��ʼ����Ʋ���������
			Context ctx = new InitialContext();
			//ȡ��datasource��ʵ��
			DataSource ds = (DataSource)ctx.lookup(DSNAME);
			//ȡ����ݿ�����
			this.conn = ds.getConnection();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * ȡ����ݿ�����
	 * @return ��ݿ�����
	 */
	public Connection getConnection(){
		return this.conn;
	}
	/**
	 * �ر���ݿ�
	 * @throws Exception
	 */
	public void close() throws Exception{
		if(this.conn != null){
			try{
				this.conn.close();
			}catch (Exception e){
				throw e;
			}
		}
	}
	
}
