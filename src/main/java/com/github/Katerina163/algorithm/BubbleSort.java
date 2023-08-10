package com.github.Katerina163.algorithm;

public class BubbleSort implements Sort {
    @Override
    public void sort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int j = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = j;
                    isSorted = false;
                }
            }
        }
    }

    public void sortOptimization(int[] array) {
        var lastElement = array.length;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < lastElement; i++) {
                if (array[i] < array[i - 1]) {
                    int j = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = j;
                    isSorted = false;
                }
            }
            lastElement--;
        }
    }
}