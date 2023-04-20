package ru.job4j.calculator;

public class Calculator {
    public static double add(double first, double second) {
        return first + second;
    }

    public static double add(double first, double second, double third) {
        return add(first, add(second, third));
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(10, 11, 24));
        minus(7, 3);
        minus(2, 6);
    }
}
