package com.cathaybk.javaedu.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparable {

    public static void main(String[] args) {
        
        List<String> list1 = new ArrayList<>();
        list1.add("aA");
        list1.add("AA");
        list1.add("bA");
        list1.add("BA");
        System.out.println("排序前：" + list1);
        Collections.sort(list1);
        System.out.println("排序後：" + list1);
        System.out.println("-------------------");
         

        List<Person> list = new ArrayList<>();
        list.add(new Person("Mary", 25, "B Dept"));
        list.add(new Person("Peter", 29, "A Dept"));
        list.add(new Person("John", 27, "a Dept"));

        System.out.println("排序前：" + list);
        
        // 使用Collections.sort(List<T>); T需實作Comparable
        Collections.sort(list);
        System.out.println("排序後：" + list);
        
        // 實作Comparator介面
        
        Collections.sort(list, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getDept().compareTo(o2.getDept());
            }

        });
        System.out.println("dept排序後：" + list);
        
        // 使用自定義實作Comparator介面的類別
        /*
         */
        Collections.sort(list, new selfComparator());
        System.out.println("排序後：" + list);
    }

}

class selfComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getDept().compareTo( o2.getDept());
    }

}
