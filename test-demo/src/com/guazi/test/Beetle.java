package com.guazi.test;

public class Beetle extends TestClassLoader {
	protected int k = printInit("Beetle.k initialized");
	protected static int x2 = printInit("static Beetle.x2 initialized");

	public static int _i;
	private int b = 8;
	static {
		_i = 10;
	}

	static {
		_i = 20;
	}

	public static void main(String[] args) {
		System.out.println(_i);
		Beetle b = new Beetle();
	}
}
