package com.quangpham;

import javax.swing.*;
import java.util.*;


public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private final static Map<HeavenlyBody.Key,  HeavenlyBody> solarSystem = new HashMap<>();
    private final static Set<HeavenlyBody> bodies = new HashSet<>();
    private final static Set<HeavenlyBody> moons = new HashSet<>();
    private final static Set<HeavenlyBody> planets = new HashSet<>();
    private final static Set<HeavenlyBody> stars = new HashSet<>();

    public static void main(String[] args) {
	// write your code here
        HeavenlyBody.Bodytypes moon = HeavenlyBody.Bodytypes.MOON;
        HeavenlyBody.Bodytypes planet = HeavenlyBody.Bodytypes.PLANET;
        HeavenlyBody.Bodytypes star = HeavenlyBody.Bodytypes.STAR;

        Planet pluto = new Planet("pluto",812);
        Planet mar = new Planet("mar",642);
        Planet earth = new Planet("earth",231);

        HeavenlyBody callisto = new HeavenlyBody("callisto",231, moon);
        HeavenlyBody ganymede = new HeavenlyBody("ganymede",123, moon);

        HeavenlyBody sirius = new HeavenlyBody("sirius",4, star);
        HeavenlyBody vega = new HeavenlyBody("vega",45, star);



        pluto.addSatellie(callisto);
        pluto.addSatellie(ganymede);
        pluto.addSatellie(sirius);
        pluto.addSatellie(mar);

        Set<HeavenlyBody> plutoSatellie = pluto.getSatellie();

        moons.add(callisto);
        moons.add(ganymede);
        bodies.add(pluto);
        bodies.add(mar);
        bodies.add(earth);
        bodies.add(callisto);
        bodies.add(sirius);
        bodies.add(vega);


        sirius.addSatellie(earth);
        sirius.addSatellie(mar);
        sirius.addSatellie(callisto);
        Set<HeavenlyBody> sigirusStar = sirius.getSatellie();
        pluto = new Planet("pluto",129);
        bodies.add(pluto);

        printSet(sigirusStar);


        solarSystem.put(pluto.getKey(),pluto);
        solarSystem.put(earth.getKey(),earth);
        solarSystem.put(sirius.getKey(),sirius);
        solarSystem.put(vega.getKey(),vega);
        pluto = new Planet("Pluto",130);
        solarSystem.put(pluto.getKey(),pluto);
        System.out.println("========================");
        printMap(solarSystem);


        HeavenlyBody earth1 = new Planet("earth",123);
        HeavenlyBody earth2 = new HeavenlyBody("earth",456,HeavenlyBody.Bodytypes.PLANET);
        solarSystem.put(earth2.getKey(),earth2);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));

        System.out.println(solarSystem.get(HeavenlyBody.makeKey("earth", HeavenlyBody.Bodytypes.PLANET)));
    }


    public static void printSet(Set<HeavenlyBody> set){
        for( HeavenlyBody body: set){
            System.out.println(body.getKey().getName() + " - " + body.getKey().getBodytypes() + " - " + body.getOrbitalPeriod());
        }
    }

    public static void printMap (Map<HeavenlyBody.Key, HeavenlyBody> map){
            for (HeavenlyBody.Key key : map.keySet()){
                System.out.println(map.get(key).toString());
            }
    }

}
