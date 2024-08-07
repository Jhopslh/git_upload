package com.cathaybk.javaedu.lesson1;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 常數化 final
 * </pre>
 */
public class FinalDemo {

    public static void main(String[] args) {
        final int x = 10;
        //        x = 20; // 編譯錯誤: 不能重新賦值給 final 變量 x
        System.out.println("x: " + x);

        final List<String> list = new ArrayList<>();
        list.add("Hello");
        //        list = new ArrayList<>(); // 編譯錯誤: 不能重新賦值給 final 變量 list
        list.add("World");
        System.out.println("List: " + list);
    }

}
