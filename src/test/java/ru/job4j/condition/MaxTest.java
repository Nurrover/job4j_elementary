package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax10To3Then() {
        int left = 10;
        int right = 3;
        int expected = 10;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax42To42Then() {
        int left = 42;
        int right = 42;
        int expected = 42;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

}