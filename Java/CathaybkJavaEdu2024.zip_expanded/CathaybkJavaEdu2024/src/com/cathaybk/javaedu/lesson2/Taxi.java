package com.cathaybk.javaedu.lesson2;

/**
 * <pre>
 * 抽象類別的語法
 * </pre>
 */
public class Taxi extends Yellow {

    @Override
    public void changeColor(String color) {
        System.out.println("變成" + color);
    }

}
