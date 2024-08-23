package com.cathaybk.practice.nt01900440.b;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class WriteCSVFromList {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Sales("張志城", "信用卡部", 35000, 6000));
		employeeList.add(new Sales("林大鈞", "保代部", 38000, 4000));
		employeeList.add(new Supervisor("李中白", "資訊部", 65000));
		employeeList.add(new Supervisor("林小中", "理財部", 80000));

		String filePath = "C:\\Users\\Admin\\Desktop\\output.csv";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, StandardCharsets.UTF_8))) {
			StringBuilder sb = new StringBuilder();
			for (Employee employee : employeeList) {
				if (employee instanceof Sales) {
					Sales e = (Sales) employee;
					sb.append(e.getName()).append(",").append(e.getPayment() + e.getBonus());
				} else {
					sb.append(employee.getName()).append(",").append(employee.getSalary());	
				}
				writer.write(sb.toString());
				writer.newLine();
				sb.setLength(0);
			}
			System.out.println("數據成功寫入:" + filePath);
		}

		catch (IOException e) {
			e.printStackTrace();
			System.out.println("數據寫入失敗,原因:" + e.getMessage());
		}	
	}
}
