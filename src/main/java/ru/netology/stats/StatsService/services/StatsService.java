package ru.netology.stats.StatsService.services;

public class StatsService {

    public int SumMonth(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int middleSum(int[] sales) {


        int sum = 0;
        for (int middle : sales) {
            sum = sum + middle;
        }


        return sum / 12;
    }

    public int maxMonthSales(int[] sales) {


        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }

        return maxMonth + 1;

    }


    public int minMonthSales(int[] sales) {


        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale < sales[minMonth]) {
                minMonth = month++;
            }
            month = minMonth + 1;
        }

        return month + 1;

    }

    public int lowMiddleSum(int[] sales) {

        int lowMiddle = 0;
        for (int i : sales) {
            if (i < middleSum(sales)) {
                lowMiddle++;
            }
        }
        return lowMiddle;
    }

    public int highMiddleSum(int[] sales) {

        int highMiddle = 0;
        for (int i : sales) {
            if (i > middleSum(sales)) {
                highMiddle++;
            }
        }
        return highMiddle;
    }
}






