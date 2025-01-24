package application;

import entities.People;
import services.WomenFilterService;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Type the name and gender of the people (ex.: Mary-F,John-M):");
        String names = sc.nextLine();
        List<People> people = WomenFilterService.creatingList(names);
        List<People> women = WomenFilterService.filteringWomen(people);

        System.out.println("-------X-------X-------");
        System.out.println("These are the names of the females:");
        women.forEach(System.out::println);

        sc.close();
    }

}