package com.github.Katerina163.algorithm;

public class SelectionSort {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            var min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    var t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                    min = t;
                }
            }
        }
        return array;
    }
}