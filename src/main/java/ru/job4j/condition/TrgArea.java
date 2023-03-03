package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = 0.5 * (a + b + c);
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }

}