package com.guazi.test;

public class HashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("加了些配置-朱霜竹");
		System.out.println(HashTest.additiveHash("zhushuangzhu", 13));
	}

	public static int additiveHash(String key, int prime) {
		int hash, i;
		for (hash = key.length(), i = 0; i < key.length(); i++) {
			System.out.println("key.charAt(i)=" + key.charAt(i));
			hash += key.charAt(i);
			System.out.println("hash=" + hash);
		}
		return (hash % prime);
	}

	static int rotatingHash(String key, int prime) {
		int hash, i;
		for (hash = key.length(), i = 0; i < key.length(); i++) {
			hash = (hash << 28) ^ key.charAt(i);
		}
		return (hash % prime);
	}

}
