package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        return max(middle, max(left, right));
    }

    public static int max(int first, int second, int third, int four) {
        return max(four, max(first, second, third));
    }

}
