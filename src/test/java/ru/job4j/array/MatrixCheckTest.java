package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(board, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNowMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', 'X', ' '},
        };
        int row = 2;
        boolean result = MatrixCheck.monoHorizontal(board, row);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(board, column);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNoMonoVertical() {
        char[][] board = {
                {' ', 'X', 'X'},
                {' ', ' ', 'X'},
                {' ', 'X', 'X'}
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(board, column);
        assertThat(result).isFalse();
    }
}