package br.com.jlev.factory;

public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Corola(100, "gasoline", "blue");
        } else {
            return new Renegade(110, "gasoline", "red");
        }
    }
}
