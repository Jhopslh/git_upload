package com.cathaybk.javaedu.lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EntryDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "小明");
        map.put("age", "22");
        map.put("gender", "性別");

        System.out.println(map);
        System.out.println("-------------");

        for (Entry<String, String> entry : map.entrySet()) {
            System.out.print("|" + entry.getKey() + " " + entry.getValue() + "| ");
        }
    }
}
