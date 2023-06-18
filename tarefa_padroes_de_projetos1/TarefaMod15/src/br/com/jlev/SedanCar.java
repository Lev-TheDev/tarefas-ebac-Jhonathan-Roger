package br.com.jlev;

public class SedanCar extends Car {

    public SedanCar(int horsepower) {
        this.horsepower = horsepower;
        System.out.println("Driving a Sedan.");
        System.out.println("Horsepower: " + horsepower + ".\n");
        System.out.println("Have a nice ride!");
    }
}
