package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class VacationCountServiceTest {

    @Test
    public void main() {
        VacationCountService service = new VacationCountService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int result = service.calculate(income, expenses, threshold);
        System.out.println(result);
    }
}
