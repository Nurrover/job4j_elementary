package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DivideBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String expected = "The number divides by 6.";
        String out = DivideBySix.checkNumber(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenNumberDividesBy3AndNotEven() {
        int in = 9;
        String expected = "The number divides by 3, but it isn't the even number.";
        String out = DivideBySix.checkNumber(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenNumberNorDivedBy3AndIsEven() {
        int in = 14;
        String expected = "The number doesn't divide by 3, but it is the even number.";
        String out = DivideBySix.checkNumber(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenNumberNotDivedBy3AndNotEven() {
        int in = 25;
        String expected = "The number doesn't divide by 3 and it isn't the even number.";
        String out = DivideBySix.checkNumber(in);
        assertThat(out).isEqualTo(expected);
    }

}