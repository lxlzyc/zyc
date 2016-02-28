package com.lxl.IDao;

import java.util.List;

import com.lxl.vo.Userlogin;

public interface IUserloginDAO {
	public boolean doCreate(Userlogin userlogin) throws Exception;
	public List<Userlogin> findAll(String keyword) throws Exception;
	public Userlogin findById(int thisid) throws Exception;
}
