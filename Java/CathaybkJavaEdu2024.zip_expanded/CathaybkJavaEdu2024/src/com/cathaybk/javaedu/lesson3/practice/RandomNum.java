package com.cathaybk.javaedu.lesson3.practice;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomNum {

    public static void main(String[] args) {
        Set<Integer> results = new TreeSet<>();
        Random random = new Random();
        while (results.size() < 5) {
            results.add(random.nextInt(10) + 1);
        }
        System.out.println(results);
    }

}
