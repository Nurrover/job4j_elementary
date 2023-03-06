package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void whenAC2AB2BC2ThenExist() {
        double ac = 2;
        double ab = 2;
        double bc = 2;
        boolean out = Triangle.exist(ac, ab, bc);
        assertThat(out).isTrue();
    }

    @Test
    public void whenAB10AC3BC2ThenNoExist() {
        double ab = 10;
        double ac = 3;
        double bc = 2;
        boolean out = Triangle.exist(ab, ac, bc);
        assertThat(out).isFalse();
    }

}