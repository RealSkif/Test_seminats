package org.example.semifinal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompareAverageTest {
    @Test
    public void testCalculateAverage() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);

        double result = CompareAverage.calculateAverage(list);

        assertEquals(10.0, result, 0.01);
    }

    @Test
    public void testCompareAveragesForListOneIsLesser() {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(5, 6, 7, 8, 9);

        String result = CompareAverage.compareAverages(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAveragesForListTwoIsLesser() {
        List<Integer> list1 = List.of(5, 6, 7, 8, 9);
        List<Integer> list2 = List.of(1, 2, 3, 4, 5);

        String result = CompareAverage.compareAverages(list1, list2);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAveragesForEqualsLists() {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(1, 2, 3, 4, 5);

        String result = CompareAverage.compareAverages(list1, list2);

        assertEquals("Средние значения равны", result);
    }
}