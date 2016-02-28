package com.lxl.test;

import java.util.Date;

public class TestForDate {
	
	public Date getNowDate(){
		return new Date();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new TestForDate().getNowDate());
	}

}
