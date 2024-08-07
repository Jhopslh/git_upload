package com.cathaybk.javaedu.lesson3;

public class Person
implements Comparable<Person>
{
    private String name;

    private String dept;

    private int age;

    public Person(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.dept;
    }


}
