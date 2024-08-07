package com.cathaybk.javaedu.lesson3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());

        doSort(list);
        System.out.println(list.size());
        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
        doSort(list2);
        System.out.println(list2);
    }

    public static void doSort(List<Integer> list) {
        // doSomething;
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
    }

}
