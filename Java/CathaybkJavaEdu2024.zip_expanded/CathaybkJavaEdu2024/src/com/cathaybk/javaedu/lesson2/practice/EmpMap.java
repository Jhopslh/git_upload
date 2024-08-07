package com.cathaybk.javaedu.lesson2.practice;

import java.util.HashMap;
import java.util.Map;

public class EmpMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("12345", "王大同");
        map.put("02345", "李中明");
        map.put("82345", "林小白");
        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println(map.get("12345"));
    }

}
