package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RollBackArrayTest {
    @Test
    public void whenEmpty() {
        int[] input = {};
        int[] expected = {};
        int[] result = RollBackArray.rollBack(input);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenOne() {
        int[] input = {1};
        int[] expected = {1};
        int[] result = RollBackArray.rollBack(input);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenFull() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        int[] result = RollBackArray.rollBack(input);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTheSame() {
        int[] input = {1, 1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1, 1};
        int[] result = RollBackArray.rollBack(input);
        assertThat(result).containsExactly(expected);
    }
}