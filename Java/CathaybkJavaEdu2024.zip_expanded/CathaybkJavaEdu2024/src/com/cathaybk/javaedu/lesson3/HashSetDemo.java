package com.cathaybk.javaedu.lesson3;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        
        Set<Student> students = new HashSet<>();
        students.add(new Student("Justin", "B835031"));
        students.add(new Student("Monica", "B835032"));
        students.add(new Student("Justin", "B835031"));
        System.out.println(students);

        Set<String> strSet = new HashSet<>();
        strSet.add("1");
        strSet.add(new String("1"));
        strSet.add(new String("1"));
        System.out.println(strSet);

        System.out.println("1".equals(new String("1")));
        System.out.println(new String("1").equals(new String("1")));
    }
}
