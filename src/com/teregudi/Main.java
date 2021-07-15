package com.teregudi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody tempStar = new Star("Sun", 1000000);
        solarSystem.put(tempStar.getName(), tempStar);

        HeavenlyBody asteroid = new Asteroid("Beta Minor", 127);
        solarSystem.put(asteroid.getName(), asteroid);
        tempStar.addSatellite(asteroid);

        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        tempStar.addSatellite(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        tempStar.addSatellite(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        tempStar.addSatellite(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        tempStar.addSatellite(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        tempStar.addSatellite(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Saturn", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        tempStar.addSatellite(temp);

        System.out.println("The Solar System:");
        for (Map.Entry<String, HeavenlyBody> entry : solarSystem.entrySet()) {
            System.out.println("\t" + entry.getValue().getName() + ", " + entry.getValue().getOrbitalPeriod() +
                    ", " + entry.getValue().getBodyType().toString());
        }

        HeavenlyBody hhh = new Planet("Earth", 100);
        solarSystem.put(hhh.getName(), hhh);
        planets.add(hhh);
        System.out.println("The Solar System:");
        for (Map.Entry<String, HeavenlyBody> entry : solarSystem.entrySet()) {
            System.out.println("\t" + entry.getValue().getName() + ", " + entry.getValue().getOrbitalPeriod() +
                    ", " + entry.getValue().getBodyType().toString());
        }

    }


}
