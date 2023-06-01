package dev.jotxee;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterByNumbersTest {

    @Test
    void test1 () {
        assertEquals( List.of(1,2), FilterByNumbers.filterList(List.of(1, 2, "a", "b")));
    }

    @Test
    void test2 () {
        assertEquals( List.of(1, 2, 231), FilterByNumbers.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)));
    }

    @Test
    void test3 () {
        assertEquals(List.of(1,2,0,15), FilterByNumbers.filterList(List.of(1, 2, "a", "b", 0, 15)));
    }

    @Test
    public void examples() {
        assertEquals(List.of(1, 2), FilterByNumbers.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
        assertEquals(List.of(1, 0, 15), FilterByNumbers.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
        assertEquals(List.of(1, 2, 123), FilterByNumbers.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }
}