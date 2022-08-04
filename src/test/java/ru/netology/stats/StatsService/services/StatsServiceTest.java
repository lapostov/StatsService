package ru.netology.stats.StatsService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void SumMonth() {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expectedSum = 180;
        int actualSum = service.SumMonth(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void middleSum() {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expectedMiddleSum = 15;
        int actualMiddleSum = service.middleSum(sales);

        Assertions.assertEquals(expectedMiddleSum, actualMiddleSum);

    }

    @Test
    public void maxMonthSales() {
        int[] sales = {9, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expectedLastMax = 8;
        int actualLastMax = service.maxMonthSales(sales);

        Assertions.assertEquals(expectedLastMax, actualLastMax);

    }

    @Test
    public void minMonthSales() {
        int[] sales = {9, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expectedLastMin = 8;
        int actualLastMin = service.maxMonthSales(sales);

        Assertions.assertEquals(expectedLastMin, actualLastMin);

    }

    @Test
    public void lowMiddleSum() {
        int[] sales = {9, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expectedLastMin = 5;
        int actualLastMin = service.lowMiddleSum(sales);

        Assertions.assertEquals(expectedLastMin, actualLastMin);

    }

    @Test
    public void highMiddleSum() {
        int[] sales = {9, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expectedLastHigh = 5;
        int actualLastHigh = service.highMiddleSum(sales);

        Assertions.assertEquals(expectedLastHigh, actualLastHigh);

    }


}

