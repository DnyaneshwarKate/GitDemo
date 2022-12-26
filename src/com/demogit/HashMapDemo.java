package com.demogit;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Amit", 45);
		map.put("Abhi", 48);
		map.put("chetan", 46);

//		map.forEach(X,Y)->((System.out.println(X+" "+Y)););
		System.out.println(map);
	}

}
