package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class SwitchArrayTest {

    @Test
    public void when5Swap10Then10And5() {
        int[] array = {5, 21, -1, 2, 10};
        int[] expected = {10, 21, -1, 2, 5};
        int[] rsl = SwitchArray.swapBorder(array);
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    public void whenSwap0to2() {
        int[] array = {1, 2, 3, 4, 6};
        int source = 0;
        int dest = 2;
        int[] expected = {3, 2, 1, 4, 6};
        int[] rsl = SwitchArray.swap(array, source, dest);
        assertThat(rsl).containsExactly(expected);
    }
}