package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 10, 3};
        int el = 5;
        int expected = 0;
        int rsl = FindLoop.indexOf(data, el);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas12ThenMinus1() {
        int[] data = {1, 23, 54, 10, -13, 2000, -3};
        int el = 12;
        int expected = -1;
        int rsl = FindLoop.indexOf(data, el);
        assertThat(rsl).isEqualTo(expected);
    }
}