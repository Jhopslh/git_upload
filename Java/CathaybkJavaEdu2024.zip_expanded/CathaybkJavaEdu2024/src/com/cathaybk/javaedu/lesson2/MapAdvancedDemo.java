package com.cathaybk.javaedu.lesson2;

import java.util.Map;
import java.util.TreeMap;

public class MapAdvancedDemo {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("Aame", "小明");
        map.put("Age", "22");
        map.put("gender", "性別");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        /*
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name", "小明");
        linkedHashMap.put("age", "22");
        linkedHashMap.put("gender", "性別");
        System.out.println(linkedHashMap);
         */
    }
}
