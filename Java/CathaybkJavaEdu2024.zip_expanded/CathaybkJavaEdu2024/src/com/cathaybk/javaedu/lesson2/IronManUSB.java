package com.cathaybk.javaedu.lesson2;

public class IronManUSB implements USB {

    @Override
    public void connect() {
        System.out.println("connect" + TYPE);
    }

}
