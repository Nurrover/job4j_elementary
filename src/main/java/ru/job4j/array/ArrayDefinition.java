package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Размер массива ages равен:" + ages.length);
        System.out.println("Размер массива surnames равен:" + surnames.length);
        System.out.println("Размер массива prices равен:" + prices.length);

        String[] names = new String[4];
        names[0] = "Peter Arsentev";
        names[1] = "Nurlan Safarov";
        names[2] = "Korobeinikov Stas";
        names[3] = "Lana Sergeeva";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
