package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EndsWithTest {
    @Test
    public void whenEndWithPostfixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endWith(word, post);
        assertThat(result).isTrue();
    }

    @Test
    public void whenEndWithPostfixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endWith(word, post);
        assertThat(result).isFalse();
    }
}