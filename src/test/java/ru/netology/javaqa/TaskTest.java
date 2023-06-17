package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void getId() {
        Task task = new Task(10);

        int actual = task.GetId();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equalsId() {
        Task task = new Task(1);
        Task task2 = new Task(1);

        boolean actual = task.equals(task2);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotEqualsId() {
        Task task = new Task(1);
        Task task2 = new Task(2);

        boolean actual = task.equals(task2);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equalsTheSameObject() {
        Task task = new Task(1);

        boolean actual = task.equals(task);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotEqualsWithNull() {
        Task task = new Task(1);

        boolean actual = task.equals(null);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotEqualsWithAnotherObject() {
        Task task = new Task(1);
        Task task2 = new Epic(1, new String[]{"Task"});

        boolean actual = task.equals(task2);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void hashCodeEqual() {
        Task task = new Task(1);

        int actual = task.hashCode();
        int expected = Objects.hash(1);

        Assertions.assertEquals(expected, actual);
    }
}