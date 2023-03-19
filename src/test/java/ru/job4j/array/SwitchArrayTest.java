package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {

    @Test
    public void when5Swap10Then10And5() {
        int[] array = {5, 21, -1, 2, 10};
        int[] expected = {10, 21, -1, 2, 5};
        int[] rsl = SwitchArray.swapBorder(array);
        assertThat(rsl).containsExactly(expected);
    }
}