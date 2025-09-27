package com.gardenclassproject;

public class Garden {
    // attribute fields:
    public String type;
    public int capacity;

    // constructor method:
    public Garden(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
        // behaviors:
        public void getType(){
            System.out.println("This garden is a " + type + " garden.");
        }
        public void checkCapacity(){
            System.out.println("The " + type + " garden's capacity is " + capacity + ".");
        }
}