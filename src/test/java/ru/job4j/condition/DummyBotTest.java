package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {

    @Test
    public void whenHiBotThenHiSmartAss() {
        String in = "Hi, Bot.";
        String expected = "Hi, SmartAss.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenByeThenSeeYouLater() {
        String in = "Bye.";
        String expected = "See you later.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenOtherThenUnknownBot() {
        String in = "Can you add two plus two?";
        String expected = "I don't know. Please, ask another question.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }
}