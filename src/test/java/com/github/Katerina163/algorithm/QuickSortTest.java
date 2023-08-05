package com.github.Katerina163.algorithm;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class QuickSortTest {
    @Test
    public void correct() {
        int[] test = {1, 2, 3, 0, 6, 5, 4};
        QuickSort.sort(test, 0, test.length - 1);
        int[] waiting = {0, 1, 2, 3, 4, 5, 6};
        assertThat(test, is(waiting));
    }

    @Test
    public void zero() {
        int[] test = {0};
        QuickSort.sort(test, 0, test.length - 1);
        int[] res = {0};
        assertThat(test, is(res));
    }
}