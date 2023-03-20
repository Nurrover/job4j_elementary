package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EqLastTest {
    @Test
    public void whenEq() {
        int[] left = {1, 2, 3, 4, 5};
        int[] right = {1, 7, 5};
        boolean result = EqLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 5, 2, 0, -1};
        int[] right = {-1, 3, 4, 2};
        boolean result = EqLast.check(left, right);
        assertThat(result).isFalse();
    }
}