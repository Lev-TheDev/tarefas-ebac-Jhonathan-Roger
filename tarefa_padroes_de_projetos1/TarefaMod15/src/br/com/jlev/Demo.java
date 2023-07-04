package br.com.jlev;
//o padrão Factory Method permite que uma classe delegue a responsabilidade de criação de objetos para suas subclasses
//oferecendo uma maneira flexível de criar famílias de objetos relacionados sem depender de suas classes concretas

public class Demo {
    public static void main(String args[]) {
        CarFactory factory = new CarFactory();
        String model = "SUV";
        int horsepower = 190;
        factory.getCar(model, horsepower);
    }
}
