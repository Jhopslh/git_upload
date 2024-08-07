package com.cathaybk.javaedu.lesson2;

import java.util.HashMap;
import java.util.Map;

public class GenericTest {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        //        map.put(3, 123);

        String getValue = map.get(1);
    }

}
