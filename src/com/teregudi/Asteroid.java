package com.teregudi;

public class Asteroid extends HeavenlyBody{
    public Asteroid(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, Type.ASTEROID);
    }
}
