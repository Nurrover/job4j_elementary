package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] rsl = new int[0];
        while (i < j) {
            if (array[i] + array[j] == target) {
                rsl = new int[]{i, j};
                break;
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return rsl;
    }

    public static int[] getIndexesVersionTwo(int[] array, int target) {
        int[] rsl = new int[0];
        int i = 0;
        int j = 1;
        while (i < array.length && j < array.length) {
            if (array[i] + array[j] == target) {
                rsl = new int[]{i, j};
                break;
            } else if (j == array.length - 1 || array[i] + array[j] > target) {
                i++;
                j = i + 1;
            }
            j++;
        }
        return rsl;
    }

}
