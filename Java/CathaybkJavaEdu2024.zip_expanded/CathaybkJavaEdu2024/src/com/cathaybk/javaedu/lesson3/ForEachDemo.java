package com.cathaybk.javaedu.lesson3;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        for (String str : list) {
            System.out.print(str + " ");
        }

        System.out.println();

        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
            System.out.println(list.get(i));
            cnt++;
        }

        System.out.println(list + ", cnt: " + cnt);

    }

}
