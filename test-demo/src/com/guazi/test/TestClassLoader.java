package com.guazi.test;

public class TestClassLoader {

	private int i = 9;
	protected int j;
	protected static int x1 = printInit("static Insect.x1 initialized");
	
	TestClassLoader() {
		System.out.println("基类构造函数阶段： i = " + i + ", j = " + j);
		j = 39;
	}

	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

