package com.gardenclassproject;

public class Plant extends Garden {

    // attributes
    private String species;
    private boolean harvestable;

    // constructor method
    public Plant(String type, int capacity, String species, boolean harvestable){
        super(type, capacity);
        this.species = species;
        this.harvestable = harvestable;
    }

    // behaviors
    public void identify(){
        System.out.println("This " + type + " is a " + species + ".");
    }
    public void checkRipeness(){
        System.out.println("Harvestable: " + harvestable);
    }
}