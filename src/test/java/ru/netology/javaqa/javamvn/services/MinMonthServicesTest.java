package ru.netology.javaqa.javamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMonthServicesTest {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldFindSumSalesInYear() {
        MinMonthService service = new MinMonthService();

        int expectedSumMonth = 180;
        int actualSumMonth = service.getSumYear(sales);

        Assertions.assertEquals(expectedSumMonth, actualSumMonth);
    }

    @Test
    public void shouldFindSalesPerMonth() {
        MinMonthService service = new MinMonthService();

        int expectedSalesPerMonth = 15;
        int actualSalesPerMonth = service.getSalesPerMonth(sales);

        Assertions.assertEquals(expectedSalesPerMonth, actualSalesPerMonth);
    }

    @Test
    public void shouldFindBetweenEnds() {
        MinMonthService service = new MinMonthService();

        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldFindMonthOverSalesPerMonth() {
        MinMonthService service = new MinMonthService();

        int expectedMonthOverSalesPerMonth = 5;
        int actualMonthOverSalesPerMonth = service.getMonthOverSalesPerMonth(sales);

        Assertions.assertEquals(expectedMonthOverSalesPerMonth, actualMonthOverSalesPerMonth);
    }

    @Test
    public void shouldFindMonthUnderSalesPerMonth() {
        MinMonthService service = new MinMonthService();

        int expectedMonthUnderSalesPerMonth = 5;
        int actualMonthUnderSalesPerMonth = service.getMonthUnderSalesPerMonth(sales);

        Assertions.assertEquals(expectedMonthUnderSalesPerMonth, actualMonthUnderSalesPerMonth);
    }

    @Test
    public void shouldFindBetweenEndsMax() {

        MinMonthService service = new MinMonthService();
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxMonth(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }
}

