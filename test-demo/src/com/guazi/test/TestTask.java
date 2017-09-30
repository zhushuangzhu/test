package com.guazi.test;

public class TestTask {

	public static void main(String[] args) {
		TaskPool pool = new TaskPool();
		for (int i = 0; i < 100000; i++) {
			pool.submit(new Task(i));
		}
	}
}
