package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int vacation = 0;
        int month;
        for (month = 0; month < 12; month++) {
            if (money >= threshold) {
                vacation++;
                money -= expenses;
                money /= 3;
            } else {
                money += income;
                money -= expenses;
            }
        }
        return vacation;
    }
}
