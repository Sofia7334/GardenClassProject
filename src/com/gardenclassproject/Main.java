package com.gardenclassproject;

// tester class
public class Main {

    // main method:
    public static void main(String[] arg){

        Garden newGarden = new Garden("vegetable");
        newGarden.getType();
        newGarden.checkCapacity();

        Plant vegetable = new Plant("vegetable", "carrot", false);
        vegetable.identify();
        vegetable.check_ripeness();

    }
}