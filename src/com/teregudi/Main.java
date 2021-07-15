package com.teregudi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody tempStar = new Star("Sun", 1000000, Type.STAR);
        solarSystem.put(tempStar.getName(), tempStar);

        HeavenlyBody temp = new Planet("Mercury", 88, Type.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225, Type.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365, Type.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27, Type.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new Planet("Mars", 687, Type.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3, Type.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new Moon("Phobos", 0.3, Type.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new Planet("Jupiter", 4332, Type.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8, Type.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new Moon("Europa", 3.5, Type.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new Moon("Ganymede", 7.1, Type.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new Moon("Callisto", 16.7, Type.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new Planet("Saturn", 225, Type.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody asteroid = new Asteroid("Beta Minor", 127, Type.ASTEROID);
        solarSystem.put(asteroid.getName(), asteroid);
    }
}
