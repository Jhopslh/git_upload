package com.cathaybk.practice.nt01900440.b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice6 {

	public static void main(String[] args) {
		String filein = "C:\\Users\\Admin\\Desktop\\Java評量_第6題cars.csv";
		String fileout = "C:\\Users\\Admin\\Desktop\\cars2.csv";
		List<Map<String, String>> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filein));
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileout))) {
			String header = br.readLine();
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				Map<String, String> map = new HashMap<>();
				map.put("MANUFACTURE", values[0]);
				map.put("TYPE", values[1]);
				map.put("MIN_PRICE", values[2]);
				map.put("PRICE", values[3]);
				list.add(map);
			}
			Collections.sort(list, new Comparator<Map<String, String>>() {
				@Override
				public int compare(Map<String, String> o1, Map<String, String> o2) {
					return o2.get("PRICE").compareTo(o1.get("PRICE"));
				}
			});

			bw.write(header);
			bw.newLine();
			StringBuilder sb = new StringBuilder();
			for (Map<String, String> map : list) {
				sb.append(map.get("MANUFACTURE")).append(",").append(map.get("TYPE")).append(",")
						.append(map.get("MIN_PRICE")).append(",").append(map.get("PRICE"));
				bw.write(sb.toString());
				bw.newLine();
				sb.setLength(0);
			}
			System.out.println("新增成功");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
