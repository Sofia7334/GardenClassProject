package com.gardenclassproject;

public class Plant extends Garden {

    // attributes
    private String species;
    private boolean harvestable;

    // constructor method
    public Plant(String type, String species, boolean harvestable){
        super(type);
        this.species = species;
        this.harvestable = harvestable;
    }

    // behaviors
    public void identify(){
        System.out.println("This " + type + " is a " + species + ".");
    }
    public void check_ripeness(){
        System.out.println("Harvestable: " + harvestable);
    }
}