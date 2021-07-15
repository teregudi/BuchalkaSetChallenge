package com.teregudi;

public class Planet extends HeavenlyBody{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, Type.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody hb) {
        if (hb != null && hb.getBodyType() == Type.MOON){
            return this.satellites.add(hb);
        }
        return false;
    }
}
