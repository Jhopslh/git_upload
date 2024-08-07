package com.cathaybk.javaedu.lesson1;

@SuppressWarnings("static-access")
public class CountArea {

    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(4);
        System.out.println(Circle.PI);
        System.out.println(c1.PI == c2.PI);
    }

}
