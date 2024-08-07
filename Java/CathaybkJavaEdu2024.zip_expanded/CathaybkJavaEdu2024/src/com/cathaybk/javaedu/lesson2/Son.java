package com.cathaybk.javaedu.lesson2;

/**
 * <pre>
 * 建構子與繼承
 * </pre>
 */
public class Son extends Father {

    private String name;

    public Son() {
        System.out.println("Son 建構子印出內容");
    }

    public Son(String name) {
        super();
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
