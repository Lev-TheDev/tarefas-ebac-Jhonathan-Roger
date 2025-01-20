package application;

import entities.People;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Type the name and gender of the people (ex.: Mary-F,John-M):");
        String names = sc.nextLine();

        List<String> listString = Arrays.stream(names.split(","))
                .toList();
        List<People> peopleL = new ArrayList<>();
        for (String p : listString) {
            String[] nameGender = p.split("-");
            People person = new People(nameGender[0],nameGender[1]);
            peopleL.add(person);
        }

        System.out.println("-------X-------X-------");
        System.out.println("These are the names of the females:");
        peopleL.stream()
                        .filter(p -> p.getGender().equalsIgnoreCase("F"))
                        .sorted(Comparator.comparing(People::getName))
                        .forEach(System.out::println);

        sc.close();
    }
}