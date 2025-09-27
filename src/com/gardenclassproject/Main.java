package com.gardenclassproject;

// tester class
public class Main {

    // main method:
    public static void main(String[] arg){

        Garden newGarden = new Garden("vegetable", 5);
        newGarden.getType();
        newGarden.checkCapacity();

        Plant vegetable = new Plant("vegetable", 5, "carrot", false);
        vegetable.identify();
        vegetable.checkRipeness();

    }
}