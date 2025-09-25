package com.gardenclassproject;

public class Garden {
    // attribute fields:
    public String type;

    // constructor method:
    public Garden(String type) {
        this.type = type;
    }
        // behaviors:
        public void getType(){
            System.out.println("This garden is a " + type + "garden.")
        }
}