package br.com.jlev;

public class SUVCar extends Car {

    public SUVCar(int horsepower) {
        this.horsepower = horsepower;
        System.out.println("Driving a SUV.");
        System.out.println("Horsepower: " + horsepower + ".\n");
        System.out.println("Have a nice ride!");
    }
}
