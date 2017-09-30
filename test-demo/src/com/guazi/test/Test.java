package com.guazi.test;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author zhushuangzhu
 * @date 2017年8月4日 上午11:02:36
 * 
 */
public class Test {
	private int a = 1;

	private static Test test = new Test();

	private Test() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		System.out.println(-1 ^ -1 << 10);
		System.out.println(Integer.toBinaryString(-2));
	}

}
