package com.cathaybk.javaedu.lesson3;

import java.util.ArrayList;
import java.util.List;

import com.cathaybk.javaedu.lesson2.practice.practice2.ComStudent;
import com.cathaybk.javaedu.lesson2.practice.practice2.LangStudent;
import com.cathaybk.javaedu.lesson2.practice.practice2.Student;

public class DemoPolymorphism {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new LangStudent("小明", 88888, 1, "英文"));
        list.add(new ComStudent("小華", 77777, 2, "Java"));

        for (Student std : list) {
            if (std instanceof ComStudent) {
                ((ComStudent) std).programming();
            } else if (std instanceof LangStudent) {
                ((LangStudent) std).writing();
            }
        }
    }

}
