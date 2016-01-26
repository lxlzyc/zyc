package com.lxl.DBbase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BaseDbCon {
	//定义JNDI的查找名称  前端通用
	private static final String DSNAME = "java:comp/env/jdbc/test";
	
	private Connection conn = null;
	
	//构造方法进行数据库连接
	public BaseDbCon() throws Exception{
		try{
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup(DSNAME);
			this.conn = ds.getConnection();
		}catch(Exception e){
			e.printStackTrace();
//			System.out.println(this.);
		}
	}
	// 取到数据库连接
	public Connection getConnection(){
		return this.conn;
	}
	// 关闭数据库连接
	public void close() throws Exception{
		if(this.conn !=null){
			try{
				this.conn.close();
			}catch(Exception e){
				throw e;
			}
		}
	}
	
	public int  count() throws Exception{
		PreparedStatement pstam = null;
		ResultSet rs = null;
		int count = 0;
		Connection con = this.getConnection();
		try{
			pstam = con.prepareStatement("select userid  from userinfo where username = 'lxl'");
			rs = pstam.executeQuery();
			if(rs.next()){
				count = rs.getInt("userid");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			this.close();
		}
		return count;
	}
	
}
