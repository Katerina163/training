package com.github.Katerina163.algorithm;

public class HeapSort implements Sort {
    @Override
    public void sort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            down(a, i, a.length);
        }
        for (int i = a.length - 1; i > 0; i--) {
            swap(a, 0, i);
            down(a, 0, i);
        }
    }

    private void down(int[] a, int i, int n) {
        int child;
        int tmp;
        for (tmp = a[i]; forLeft(i) < n; i = child) {
            child = forLeft(i);
            if (child != n - 1 && (a[child] < a[child + 1])) {
                child++;
            }
            if (tmp < a[child]) {
                a[i] = a[child];
            } else {
                break;
            }
        }
        a[i] = tmp;
    }

    private int forLeft(int i) {
        return 2 * i + 1;
    }

    public void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
