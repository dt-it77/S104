package org.itacademy.javatesting.nivell1_ex1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


public class MonthsTest {
    @Test
    public void getMonthsTest(){
        Months monthsApp = new Months();
        ArrayList<String> listMonths = monthsApp.getMonths();
        assertEquals(listMonths.size(),12);
        assertNotNull(listMonths);
        assertEquals(listMonths.get(7).toLowerCase(),"agost");
    } 
}
