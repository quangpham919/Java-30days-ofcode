package com.quangpham;

import java.util.HashSet;
import java.util.Set;

public  class HeavenlyBody {
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellie;
    private final Key key;

    public enum Bodytypes {
        MOON,
        PLANET,
        STAR
    }

    public HeavenlyBody(String name, double orbitalPeriod, Bodytypes bodyType ) {
        this.key = new Key(name,bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellie = new HashSet<>();

    }



    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }


    public Set<HeavenlyBody> getSatellie() {
       return new HashSet<>(this.satellie);
    }

    public boolean addSatellie(HeavenlyBody body){
        return this.satellie.add(body);
    }

    protected Key getKey() {
        return key;
    }

    public static Key makeKey(String name, Bodytypes bodytypes){
        return new Key(name,bodytypes);
    }


    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if(obj instanceof HeavenlyBody){
            HeavenlyBody theObj = (HeavenlyBody) obj;
            return this.key.equals(theObj.getKey());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.key.name + " - " + this.key.bodytypes + " - "+this.orbitalPeriod;
    }

    public static final class Key {
       private String name;
       private Bodytypes bodytypes;

       private Key(String name, Bodytypes bodytypes){
           this.name = name;
           this.bodytypes = bodytypes;
       }

        public String getName() {
            return name;
        }

        public Bodytypes getBodytypes() {
            return bodytypes;
        }

        @Override
        public int hashCode() {
            return  this.bodytypes.hashCode() + this.name.hashCode() + 57;
        }

        @Override
        public boolean equals(Object obj) {
           Key theKey = (Key) obj;
           if(this.name.equals(theKey.getName())){
               return this.bodytypes == theKey.getBodytypes();
           }
           return false;
        }
    }
}
