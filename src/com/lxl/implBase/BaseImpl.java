package com.lxl.implBase;

import java.util.List;


public interface BaseImpl {
	
	public boolean doCreate(Object obj) throws Exception;
	public List<Object> findneed(Object obj) throws Exception;
	public Object findById(Object obj) throws Exception;
	public boolean doUpdate(Object obj) throws Exception;
	public boolean delete(Object obj) throws Exception;
}
