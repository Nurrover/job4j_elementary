package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] data = {true, true, true};
        boolean rsl = Check.mono(data);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenDataMonoByTrueThenFalse() {
        boolean[] data = {true, false, true};
        boolean rsl = Check.mono(data);
        assertThat(rsl).isFalse();
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] data = {false, false, false};
        boolean rsl = Check.mono(data);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenDataMonoByFalseThenFalse() {
        boolean[] data = {false, true, false};
        boolean rsl = false;
        assertThat(rsl).isFalse();
    }
}