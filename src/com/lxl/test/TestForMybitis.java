package com.lxl.test;



import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lxl.mybatis.Author;
import com.lxl.mybatis.TestForMybatisDelete;
import com.lxl.vo.Userlogin;

public class TestForMybitis {
	
	public static void insert(){
		String resource = "com/lxl/mybatis/MyBatisConfig.xml";
		Reader reader = null;
		SqlSession session;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		session = sqlMapper.openSession();
		try{
			Userlogin us = new Userlogin();
			us.setUsername("123");
			us.setUserpassword("123456");
			session.insert("insertTest", us);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
	
	public static void update(){
		String resource = "com/lxl/mybatis/MyBatisConfig.xml";
		Reader reader = null;
		SqlSession session;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		session = sqlMapper.openSession();
		try{
			Userlogin us = new Userlogin();
			us.setUsername("update");
			us.setUserid(4);
			session.update("updateTest", us);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
	//接口
	public static void deleteByInter(){
		String resource = "com/lxl/mybatis/MyBatisConfig.xml";
		Reader reader = null;
		SqlSession session;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		session = sqlMapper.openSession();
		try{
			TestForMybatisDelete del = session.getMapper(TestForMybatisDelete.class);
			del.deleteUserlogin(1);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
	
	//配置文件
	public static void deleteByMap(){
		String resource = "com/lxl/mybatis/MyBatisConfig.xml";
		Reader reader = null;
		SqlSession session;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		session = sqlMapper.openSession();
		try{
			Userlogin us = new Userlogin();
			us.setUserid(2);
			session.delete("deleteTest", us);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
	
	public static void selectByHashmap(){
		String resource = "com/lxl/mybatis/MyBatisConfig.xml";
		Reader reader = null;
		SqlSession session;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		session = sqlMapper.openSession();
		try{
			HashMap<String,String> hm = new HashMap();
			hm.put("username", "123");
			hm.put("userpassword", "123456");
			Userlogin us = new Userlogin();
			us = session.selectOne("selectByHashmap", hm);
			System.out.println(us.getLoginip());
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
	public static void selectSimple(){
		String resource = "com/lxl/mybatis/MyBatisConfig.xml";
		Reader reader = null;
		SqlSession session;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		session = sqlMapper.openSession();
		try{
			Userlogin us2 = new Userlogin();
			us2.setUsername("123");
			us2.setUserpassword("123456");
			Userlogin us = new Userlogin();
			us = session.selectOne("selectSimple", us2);
			System.out.println(us.getLoginip());
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
	
	public static void selectList(){
		String resource = "com/lxl/mybatis/MyBatisConfig.xml";
		Reader reader = null;
		SqlSession session;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		session = sqlMapper.openSession();
		try{
			
			List<Userlogin> ls = session.selectList("selectList");
			for(Userlogin i:ls){
				System.out.println(i.getUsername());
			}	
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
	//jdbc形式事务管理
	public static void insertByJdbc(){
		String resource = "com/lxl/mybatis/MyBatisConfig.xml";
		Reader reader = null;
		SqlSession session;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		//关闭自动提交
		session = sqlMapper.openSession(false);
		try{
			List<Author> lt = session.selectList("selectCol");
			for(Author a:lt){
				System.out.println(a.getRealName());
			}
			session.commit();
		}catch(Exception e){
			session.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		insert();
//		update();
//		deleteByMap();
//		selectByHashmap();
//		selectSimple();
//		selectList();
		insertByJdbc();
	}

}
