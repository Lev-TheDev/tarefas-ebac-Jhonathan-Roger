package br.com.jlev.factory;

public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println("The " + fuelSource + " engine has been started, and is ready to utilize it's " + horsePower + " horsepower." );
        System.out.println(getClass().getSimpleName() + ", let's take you to the ride!");
    }
    public void clean(){
        System.out.println("Your car has been cleaned, and the " + color.toLowerCase() + " color shines!");
    }
    public void mechanicCheck(){
        System.out.println("It has been checked by the mechanic. Everything looks good!");
    }
    public void fuelCar(){
        System.out.println("The car is being filled with " + fuelSource.toLowerCase());
    }
}
