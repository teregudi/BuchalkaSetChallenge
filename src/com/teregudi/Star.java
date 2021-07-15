package com.teregudi;

public class Star extends HeavenlyBody{
    public Star(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, Type.STAR);
    }

    @Override
    public boolean addSatellite(HeavenlyBody hb) {
        if (hb != null && (hb.getBodyType() == Type.ASTEROID || hb.getBodyType() == Type.PLANET)){
            return this.satellites.add(hb);
        }
        return false;
    }
}
