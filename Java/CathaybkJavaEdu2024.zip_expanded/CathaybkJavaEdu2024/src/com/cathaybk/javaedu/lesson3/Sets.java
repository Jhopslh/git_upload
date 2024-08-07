package com.cathaybk.javaedu.lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {

        Set<Integer> hs = new HashSet<>();
        hs.add(9);
        hs.add(8);
        hs.add(1);
        hs.add(6);
        hs.add(5);
        hs.add(8);
        System.out.println(hs);

        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(8);
        lhs.add(9);
        lhs.add(6);
        lhs.add(5);
        lhs.add(8);
        System.out.println(lhs);

        Set<String> ts = new TreeSet<>();
        ts.add("Mary");
        ts.add("Ben");
        ts.add("John");
        System.out.println(ts);
        
        int a = 1;
        int b = 1;
        System.out.println(a==b?"相等":"不相等");

    }

}
