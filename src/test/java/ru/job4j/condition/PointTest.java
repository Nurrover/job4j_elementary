package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

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

    @Test
    public void whenX1Y2Z3ToXMinus7YMinus2Z4Then9() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(-7, -2, 4);
        double rsl = a.distance3D(b);
        double expected = 9;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void whenX0Y2Z3ToX0Y2Z4Then1() {
        Point a = new Point(0, 2, 3);
        Point b = new Point(0, 2, 4);
        double rsl = a.distance3D(b);
        double expected = 1;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void whenX2YMinus21Z7ToX6Y2Z5Then11() {
        Point a = new Point(2, -2, 7);
        Point b = new Point(6, 2, 5);
        double rsl = a.distance3D(b);
        double expected = 6;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }
}