package com.github.Katerina163.algorithm;

public class QuickSort {
    public static void sort(int[] array, int left, int right) {
        if (array.length <= 1 || left >= right) {
            return;
        }
        int middle = (left + right) / 2;
        int support = array[middle];
        int low = left;
        int high = right;
        while (low <= high) {
            while (array[low] < support) {
                low++;
            }
            while (array[high] > support) {
                high--;
            }
            if (low <= high) {
                if (low < high) {
                    int i = array[low];
                    array[low] = array[high];
                    array[high] = i;
                }
                low++;
                high--;
            }
        }
        if (left < high) {
            sort(array, left, high);
        }
        if (right > low) {
            sort(array, low, right);
        }
    }
}