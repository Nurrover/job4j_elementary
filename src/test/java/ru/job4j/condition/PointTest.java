package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void whenX0Y0ToX2Y0Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double rsl = a.distance(b);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenX10Y0ToX5Y0Then5() {
        Point a = new Point(10, 0);
        Point b = new Point(5, 0);
        double expected = 5;
        double rsl = a.distance(b);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenX7Y12ToX0Y12Then7() {
        Point a = new Point(7, 12);
        Point b = new Point(0, 12);
        double expected = 7;
        double rsl = a.distance(b);
        assertThat(rsl).isEqualTo(expected);
    }
}