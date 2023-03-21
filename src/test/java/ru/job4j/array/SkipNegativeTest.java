package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class SkipNegativeTest {
    @Test
    public void whenArrayRowAndColumnEquals() {
        int[][] array = {
                {1, -2},
                {1, 2}
        };
        int[][] expected = {
                {1, 0},
                {1, 2}
        };
        int[][] result = SkipNegative.skip(array);
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void whenArrayRow4andColumnNotEquals() {
        int[][] array = {
                {1, -2},
                {1, 2, -3},
                {1, -2, 3, -4},
                {1, 2, -3, -4, 5}
        };
        int[][] expected = {
                {1, 0},
                {1, 2, 0},
                {1, 0, 3, 0},
                {1, 2, 0, 0, 5}
        };
        int[][] result = SkipNegative.skip(array);
        assertThat(result).isDeepEqualTo(expected);
    }

}