package com.rajeshchinni;

// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

class Car{

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car.startEngine() is called";
    }

    public String accelerate(){
        return "Car.accelerate() is called";
    }

    public String brake(){
        return "Car.brake() is called";
    }
}


class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    // now lets override the methods


    @Override
    public String startEngine() {
        return "Mitsubishi.startEngine() is called";    }

    @Override
    public String accelerate() {
        return "Mitsubishi.accelerate() is called";
    }

    @Override
    public String brake() {
        return "Mitsubishi.brake() is called";
    }
}

class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    // now lets override the methods


    @Override
    public String startEngine() {
        return "Ford.startEngine() is called";    }

    @Override
    public String accelerate() {
        return "Ford.accelerate() is called";
    }

    @Override
    public String brake() {
        return "Ford.brake() is called";
    }
}

class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    // now lets override the methods


    @Override
    public String startEngine() {
        return "Holden.startEngine() is called";    }

    @Override
    public String accelerate() {
        return "Holden.accelerate() is called";
    }

    @Override
    public String brake() {
        return "Holden.brake() is called";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("******");


        Mitsubishi mitsubishi = new Mitsubishi(4,"Outlander BRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println("******");


        Ford ford = new Ford(6, "Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println("******");

        Holden holden = new Holden(6, "Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}
