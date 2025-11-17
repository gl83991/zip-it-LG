
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

class AppTest {
    @Test
    public void testZipEqualLength() {
        List<Integer> list1 = List.of(1, 3, 5);
        List<Integer> list2 = List.of(2, 4, 6);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(expected, App.zip(list1, list2));
    }
    @Test
    public void testZipFirstLonger() {
        List<Integer> list1 = List.of(1, 3, 5, 7, 9);
        List<Integer> list2 = List.of(2, 4);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 7, 9);
        assertEquals(expected, App.zip(list1, list2));
    }
    @Test
    public void testZipSecondLonger() {
        List<Integer> list1 = List.of(1, 3);
        List<Integer> list2 = List.of(2, 4, 6, 8);
        List<Integer> expected = List.of(1, 2, 3, 4, 6, 8);
        assertEquals(expected, App.zip(list1, list2));
    }
    @Test
    public void testZipEmptyLists() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, App.zip(list1, list2));
    }
    @Test
    public void testZipOneEmptyList() {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = new ArrayList<>();
        List<Integer> expected = List.of(1, 2, 3);
        assertEquals(expected, App.zip(list1, list2));
    }
}
