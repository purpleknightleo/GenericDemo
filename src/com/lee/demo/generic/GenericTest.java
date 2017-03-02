package com.lee.demo.generic;

public abstract class GenericTest {

	public abstract void test();
	
	public static void main(String[] args) {

		GenericTest test = null;

//		test = new SuperTest();
//		test.test();
		
		test = new ExtendsTest();
		test.test();
		
//		test = new WildCardTest();
//		test.test();
	}

}
