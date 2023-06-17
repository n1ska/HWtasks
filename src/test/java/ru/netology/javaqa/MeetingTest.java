package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTest {

    @Test
    void getTopic() {
        Meeting task = new Meeting(10, "shopping","Sunday", "17/06/2023 12:15");

        String actual = task.getTopic();
        String expected = "shopping";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getProject() {
        Meeting task = new Meeting(10, "shopping","Sunday", "17/06/2023 12:15");

        String actual = task.getProject();
        String expected = "Sunday";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getStart() {
        Meeting task = new Meeting(10, "shopping","Sunday", "17/06/2023 12:15");

        String actual = task.getStart();
        String expected = "17/06/2023 12:15";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void matches() {
        Meeting task = new Meeting(10, "shopping","Sunday", "17/06/2023 12:15");

        boolean actual = task.matches("shopping");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void matchesByProject() {
        Meeting task = new Meeting(10, "shopping","Sunday", "17/06/2023 12:15");

        boolean actual = task.matches("Sunday");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void notMatches() {
        Meeting task = new Meeting(10, "shopping","Sunday", "17/06/2023 12:15");

        boolean actual = task.matches("T-short");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
}