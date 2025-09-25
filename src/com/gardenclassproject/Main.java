package com.gardenclassproject;

// tester class
public cass Main {

    // main method:
    public static void main(String[] arg){

        Garden newGarden = new Garden("vegetable");
        newGarden.getType();

        Plant vegetable = new Plant("vegetable", "carrot", false);
        vegetable.identify();
        vegetable.harvestable();

    }
}