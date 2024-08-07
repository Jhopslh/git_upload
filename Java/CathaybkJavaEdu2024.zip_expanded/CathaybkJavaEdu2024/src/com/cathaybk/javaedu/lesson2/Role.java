package com.cathaybk.javaedu.lesson2;

public abstract class Role {

    private String name;

    private int level;

    private int blood;

    public abstract void fight();

    public void run() {
        System.out.println("跑");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

}
