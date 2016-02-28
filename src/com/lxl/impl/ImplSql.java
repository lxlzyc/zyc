package com.lxl.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.lxl.implBase.BaseImpl;
import com.lxl.implBase.BaseSqlGet;

public class ImplSql implements BaseImpl {
	private BaseSqlGet basesql = new BaseSqlGet();
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	@Override
	public boolean doCreate(Object obj) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = basesql.getCreateSql(obj);
		if(this.pstmt.executeUpdate()>0){
			flag = true;
		}
		this.pstmt.close();
		return flag;
	}

	@Override
	public List<Object> findneed(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findById(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doUpdate(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
