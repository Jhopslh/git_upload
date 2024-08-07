package com.cathaybk.javaedu.lesson3;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // Auto Boxing => 基本型別 int 用Integer包裝
        list.add(1);
        Integer num = list.get(0);

    }

}
