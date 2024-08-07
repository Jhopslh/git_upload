package com.cathaybk.javaedu.lesson2;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name", "小明");

        Object name = map.get("name");

        System.out.println(map);
        System.out.println(name);

    }
}