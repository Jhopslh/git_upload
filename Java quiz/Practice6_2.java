package com.cathaybk.practice.nt01900440.b;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice6_2 {

	public static void main(String[] args) {
		String filein = "C:\\Users\\Admin\\Desktop\\Java評量_第6題cars.csv";
		List<Map<String, String>> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filein))) {
			// Map<String, List<String>> groupedByM = new HashMap<>();
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
					return o1.get("MANUFACTURE").compareTo(o2.get("MANUFACTURE"));
				}
			});
			String[] header2 = header.split(",");
			System.out.printf("%-12s%s%-7s%s%9s%s%5s%s", header2[0], " ", header2[1], " ", header2[2], " ", header2[3],
					"\n");
			BigDecimal TotalMinPriceforM =  BigDecimal.ZERO;
			BigDecimal TotalPriceforM = BigDecimal.ZERO;
			BigDecimal TotalMinPrice = BigDecimal.ZERO;
			BigDecimal TotalPrice = BigDecimal.ZERO;
			//判斷list是否為empty
			for (int i = 0; i <= list.size(); i++) {
				BigDecimal minPrice = new BigDecimal(list.get(i).get("MIN_PRICE"));
				BigDecimal Price = new BigDecimal(list.get(i).get("PRICE"));
				System.out.printf("%-12s%s%-7s%s%9s%s%5s%s", list.get(i).get("MANUFACTURE"), " ",
						list.get(i).get("TYPE"), " ", list.get(i).get("MIN_PRICE"), " ", list.get(i).get("PRICE"),
						"\n");
				int i1 = i + 1;
				if (i1 == list.size()) {
					TotalMinPriceforM = TotalMinPriceforM.add(minPrice);
					TotalPriceforM = TotalPriceforM.add(Price);
					System.out.printf("%-12s%s%-7s%9s%s%5s%s", "小計", " ", "", TotalMinPriceforM, " ", TotalPriceforM,
							"\n");
					TotalMinPrice = TotalMinPrice.add(TotalMinPriceforM);
					TotalPrice = TotalPrice.add(TotalPriceforM);
					System.out.printf("%-12s%s%-7s%9s%s%5s%s", "合計", " ", "", TotalMinPrice, " ", TotalPrice, "\n");
					break;
				}
				if (list.get(i).get("MANUFACTURE").equals(list.get(i1).get("MANUFACTURE"))) {
					TotalMinPriceforM = TotalMinPriceforM.add(minPrice);
					TotalPriceforM = TotalPriceforM.add(Price);
				} else {
					TotalMinPriceforM = TotalMinPriceforM.add(minPrice);
					TotalPriceforM = TotalPriceforM.add(Price);
					System.out.printf("%-12s%s%-7s%9s%s%5s%s", "小計", " ", "", TotalMinPriceforM, " ", TotalPriceforM,
							"\n");
					TotalMinPrice = TotalMinPrice.add(TotalMinPriceforM);
					TotalPrice = TotalPrice.add(TotalPriceforM);
					TotalMinPriceforM = new BigDecimal("0");
					TotalPriceforM = new BigDecimal("0");
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
