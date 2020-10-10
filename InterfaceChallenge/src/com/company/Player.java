package com.company;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int health;
    private String weapon;
    private double hitpoint;

    public Player(String name, String weapon, double hitpoint) {
        this.name = name;
        this.weapon = weapon;
        this.hitpoint = hitpoint;
        this.health = 100;
    }

    @Override
    public List<String> write() {
       List<String> values = new ArrayList<String>();
        values.add(0,name);
        values.add(1,this.weapon);
        values.add(2,""+this.hitpoint );
        values.add(3,""+this.health);
       return values;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitpoint(double hitpoint) {
        this.hitpoint = hitpoint;
    }

    @Override
    public void read(List<String> arr) {
        if(arr != null && arr.size() > 0 ) {
            this.name = arr.get(0);
            this.weapon = arr.get(1);
            this.hitpoint = Integer.parseInt(arr.get(2));
            this.health = Integer.parseInt(arr.get(3));
        }

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                ", hitpoint=" + hitpoint +
                '}';
    }
}
