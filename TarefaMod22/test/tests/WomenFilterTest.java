package tests;

import application.Program;
import entities.People;
import org.junit.Test;
import services.WomenFilterService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WomenFilterTest {
    @Test
    public void filteringWomenTest(){
        String entry = "Carlos-M, Ana-F, Izabel-F, Eduardo-M, Joaquim-M, Amanda-F";

        List<People> people = WomenFilterService.creatingList(entry);
        List<People> women = WomenFilterService.filteringWomen(people);

        assertEquals(3, women.size());
        for (People w : women) {
            assertEquals("F", w.getGender());
        }

        assertTrue(women.stream().anyMatch(p -> p.getName().equals("Ana")));
        assertTrue(women.stream().anyMatch(p -> p.getName().equals("Izabel")));
        assertTrue(women.stream().anyMatch(p -> p.getName().equals("Amanda")));
    }
}
