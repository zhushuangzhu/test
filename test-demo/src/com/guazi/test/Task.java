package com.guazi.test;

public class Task implements Runnable {

	private int num;
	public Task(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		System.out.println(num);
	}
}
