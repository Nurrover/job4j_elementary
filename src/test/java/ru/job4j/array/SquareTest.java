package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SquareTest {

    @Test
    public void whenBound3Then0To4() {
        int bound = 3;
        int[] expected = {0, 1, 4};
        int[] result = Square.calculate(bound);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenBound5Then0To16() {
        int bound = 5;
        int[] expected = {0, 1, 4, 9, 16};
        int[] result = Square.calculate(bound);
        assertThat(result).containsExactly(expected);
    }

}