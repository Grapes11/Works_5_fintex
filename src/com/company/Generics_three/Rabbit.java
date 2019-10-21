package com.company.Generics_three;

public class Rabbit extends Animal<Rabbit> {

    private int length;
    private int speed;

    public Rabbit setLength(int length) {
        this.length = length;
        return this;
    }

    public Rabbit setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

}