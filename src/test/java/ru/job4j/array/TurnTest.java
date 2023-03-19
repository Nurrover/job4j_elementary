package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {4, 1, 6, 2};
        int[] expected = {2, 6, 1, 4};
        int[] rsl = Turn.back(input);
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl).containsExactly(expected);
    }
}