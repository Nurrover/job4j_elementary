package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        int[] rsl = new int[0];
        while (i < array.length) {
            if (array[i] + array[j] == target) {
                rsl = new int[] {i, j};
                break;
            } else if (array[i] > target && array[j] > target) {
                break;
            }
            if (j == array.length - 1) {
                i++;
                j = 0;
            }
            j++;
        }
        return rsl;
    }

    public static int[] getIndexesVersionTwo(int[] array, int target) {
        int[] rsl = new int[0];
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    rsl = new int[] {i, j};
                    break;
                } else if (array[i] > target && array[j] > target) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return rsl;
    }

}
