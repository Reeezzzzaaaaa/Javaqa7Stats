package ru.netology.javaqa.javamvn.services;

public class MinMonthService {

    public int getSumYear(int[] sales) {

        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int getSalesPerMonth(int[] sales) {

        int salesSumYear = getSumYear(sales);
        int salesPerMonth = salesSumYear / 12;

        return salesPerMonth;
    }

    public int getMinMonth(int[] sales) {

        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMonthOverSalesPerMonth(int[] sales) {

        int salesPerMonth = getSalesPerMonth(sales);
        int monthOverSalesPerMonth = 0;


        for (int s : sales) {
            if (s > salesPerMonth) {
                monthOverSalesPerMonth = monthOverSalesPerMonth + 1;
            }
        }
        return monthOverSalesPerMonth;
    }

    public int getMonthUnderSalesPerMonth(int[] sales) {

        int salesPerMonth = getSalesPerMonth(sales);
        int monthUnderSalesPerMonth = 0;


        for (int s : sales) {
            if (s < salesPerMonth) {
                monthUnderSalesPerMonth = monthUnderSalesPerMonth + 1;
            }
        }
        return monthUnderSalesPerMonth;
    }

    public int getMaxMonth(int[] sales) {

        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }
}
