package services;

import entities.People;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WomenFilterService {
    public static List<People> creatingList(String names) {
        List<People> peopleList = new ArrayList<>();
        for (String item : names.split(",")) {
            String[] nameGender = item.trim().split("-");
            if (nameGender.length == 2) {
                peopleList.add(new People(nameGender[0].trim(), nameGender[1].trim()));
            }
        }
        return peopleList;
    }

    public static List<People> filteringWomen(List<People> listP) {
        return listP.stream()
                .filter(p -> p.getGender().equalsIgnoreCase("F"))
                .sorted(Comparator.comparing(People::getName))
                .collect(Collectors.toList());
    }

}
