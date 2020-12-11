package com.quangpham;

public class Planet extends HeavenlyBody  {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, Bodytypes.PLANET);
    }

    @Override
    public boolean addSatellie(HeavenlyBody moon) {
        if( moon.getKey().getBodytypes() == Bodytypes.MOON){
            return super.addSatellie(moon);
        }
        else {return false;}

    }
}
