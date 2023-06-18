package br.com.jlev;

public class CarFactory {
    public Car getCar(String model, int horsepower) {
        if (model.equalsIgnoreCase("SEDAN")) {
            return new SedanCar(horsepower);
        } else if (model.equalsIgnoreCase("SUV")) {
            return new SUVCar(horsepower);
        }
        return null;
    }
}
