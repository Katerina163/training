package com.github.Katerina163.algorithm;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class HeapSortTest {
    private final HeapSort sort = new HeapSort();

    @Test
    public void correct() {
        int[] test = {1, 2, 3, 0, 6, 5, 4};
        sort.sort(test);
        int[] waiting = {0, 1, 2, 3, 4, 5, 6};
        assertThat(test, is(waiting));
    }

    @Test
    public void zero() {
        int[] test = {0};
        sort.sort(test);
        int[] waiting = {0};
        assertThat(test, is(waiting));
    }
}