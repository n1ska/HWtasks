package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTaskTest {

    @Test
    void getTitle() {

        SimpleTask task = new SimpleTask(10, "test");

        String actual = task.GetTitle();
        String expected = "test";

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void matches() {
        SimpleTask task = new SimpleTask(10, "test");

        boolean actual = task.matches("test");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
}