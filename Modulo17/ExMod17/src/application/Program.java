package application;

import entities.Car;
import entities.CivicCar;
import entities.CorollaCar;
import entities.SentraCar;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Car> stock = new ArrayList<>();
        stock.add(new CivicCar("Civic", "Honda", 2023));
        stock.add(new CorollaCar("Corolla", "Toyota", 2022));
        stock.add(new SentraCar("Sentra", "Nissan", 2024));
        printStock(stock);

    }
    public static void printStock(List<? extends Car> stock) {
        System.out.println("Car stock:");
        for (Car e : stock) {
            System.out.println(e);
        }
    }
}