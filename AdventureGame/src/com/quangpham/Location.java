package com.quangpham;

public class Location{
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description){
        this.locationID=locationID;
        this.description=description;
        this.exits=new HashMap<String, Integer>();
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }
}