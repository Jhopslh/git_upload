package com.cathaybk.practice.nt01900440.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Practice2 {

	public static void main(String[] args) {
		Random r = new Random();
		Set<Integer> set = new HashSet<>();
		while(set.size()<=6) {
			set.add(r.nextInt(49) + 1);
		}
			
		
		List<Integer> list = new ArrayList<Integer>();
		for (Integer a : set) {
			list.add(a);
		}
		StringBuilder sb= new StringBuilder();
		sb.append("排序前:");
		for(Integer randomNumber : list) {
			sb.append(randomNumber).append(" ");
		}
		System.out.println(sb.toString());

		Collections.sort(list);
		
		sb.setLength(0);
		sb.append("排序後:");
		for(Integer randomNumber : list) {
			sb.append(randomNumber).append(" ");
		}
		System.out.println(sb.toString());
	}

}
