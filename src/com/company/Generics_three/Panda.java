package com.company.Generics_three;

public class Panda extends Animal<Panda> {
    private int length;
    private int speed;

    public Panda setLength(int length) {
        this.length = length;
        return this;
    }

    public Panda setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

}
