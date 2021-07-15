package com.teregudi;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Type bodyType;
    protected final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod, Type bodyType){
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Type getBodyType(){
        return  this.bodyType;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addSatellite(HeavenlyBody hb){
        return false;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof HeavenlyBody){
            HeavenlyBody hb = (HeavenlyBody)obj;
            return (hb.getBodyType() == this.bodyType && hb.getName() == this.getName());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.getName().hashCode() + this.bodyType.hashCode();
    }
}
