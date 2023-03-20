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

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int el = 4;
        int start = 1;
        int finish = 8;
        int expected = 3;
        int result = FindLoop.indexInRange(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThenMinus1() {
        int[] data = {-2, 10, 3, 5, 11, 54, 23, 100, -12, 4};
        int el = 8;
        int start = 2;
        int finish = 7;
        int expected = -1;
        int result = FindLoop.indexInRange(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }
}