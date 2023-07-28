package br.com.jlev.factory;

public class SemContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Brasilia(95, "ethanol", "yellow");
        } else {
            return new Santana(97, "ethanol", "green");
        }
    }
}
