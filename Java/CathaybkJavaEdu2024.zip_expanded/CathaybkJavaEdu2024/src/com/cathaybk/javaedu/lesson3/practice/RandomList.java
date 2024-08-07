package com.cathaybk.javaedu.lesson3.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomList {

	public static void main(String[] args) {
		Set<Integer> results = new TreeSet<>();
		Random random = new Random();
		while (results.size() < 15) {
			results.add(random.nextInt(100) + 1);
		}
		List<Integer> list = new ArrayList<Integer>();
		for (Integer a : results) {
			list.add(a);
		}
		int sum = 0;
		for (Integer a : list) {
			sum = sum + a;
		}
		int avg = sum / list.size();

		System.out.println(list);
		System.out.println("平均值:" + avg);

	}

}
