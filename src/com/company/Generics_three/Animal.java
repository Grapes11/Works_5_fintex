package com.company.Generics_three;

public class  Animal<T> {

    private int age;
    private String name;
    private String color;
    private String type;


    public T setAge(int age) {
        this.age = age;
        return (T) this;
    }

    public T setName(String name) {
        this.name = name;
        return (T) this;
    }

    public T setColor(String color) {
        this.color = color;
        return (T) this;
    }

}