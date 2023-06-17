package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpicTest {

    @Test
    void getSubtasks() {
        Epic task = new Epic(20,new String[]{"1 task","2 task","3 task"});

        String[] actual = task.GetSubtasks();
        String[] expected = new String[]{"1 task","2 task","3 task"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void matches() {
        Epic task = new Epic(20, new String[]{"1 task", "2 task", "3 task"});

        boolean actual = task.matches("2 task");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
}