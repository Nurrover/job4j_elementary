package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortFiveNumbers() {
        int[] data = {3, 4, 1, 2, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThreeNumbers() {
        int[] data = {10, -1, 4};
        int[] expected = {-1, 4, 10};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }

}