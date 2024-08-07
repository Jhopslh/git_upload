package com.cathaybk.javaedu.lesson2.practice;

import java.util.Map;
import java.util.TreeMap;

public class SongMap {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		map.put("Coldplay", "Yellow");
		map.put("Adele", "Skyfall");
		map.put("Lady Gaga", "Shallow");

		for (String key : map.keySet()) {
			System.out.println("Singer:" + key + ",Song:" + map.get(key));
		}
		System.out.println(map.keySet());
		System.out.println(map.values());
	}

}
