package org.example.semifinal;

import java.util.ArrayList;
import java.util.List;

public class CompareAverage {
    public static double calculateAverage(List<Integer> list) {
        if (list.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        return (double) sum / list.size();
    }

    public static String compareAverages(List<Integer> list1, List<Integer> list2) {
        double x = calculateAverage(list1) - calculateAverage(list2);
        if (x > 0)
            return  "Первый список имеет большее среднее значение";
        else if (x < 0)
            return "Второй список имеет большее среднее значение";
        else return "Средние значения равны";
    }
}
