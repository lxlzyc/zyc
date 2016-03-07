package com.lxl.mybatis;

import org.apache.ibatis.annotations.Delete;

public interface TestForMybatisDelete {
	//注解形式定义删除
	@Delete("delete from userlogin where userid=#{userid}")
	public void deleteUserlogin(Integer id);
}
