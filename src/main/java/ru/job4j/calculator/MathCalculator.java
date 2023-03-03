package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDefAndDiv(double first, double second) {
        return difference(first, second) + div(first, second);
    }

    public static double sumAllFunction(double first, double second) {
        return div(first, second) + sum(first, second)
                + difference(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDefAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumAllFunction(10, 20));
    }

}
