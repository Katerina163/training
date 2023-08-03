package com.github.Katerina163.algorithm;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BubbleSortTest {
    @Test
    public void correct() {
        int[] test = {1, 2, 3, 0, 6, 5, 4};
        var result = BubbleSort.sort(test);
        int[] waiting = {0, 1, 2, 3, 4, 5, 6};
        assertThat(result, is(waiting));
    }

    @Test
    public void zero() {
        int[] test = {0};
        var result = BubbleSort.sort(test);
        assertThat(result, is(test));
    }

    @Test
    public void correctOpt() {
        int[] test = {1, 2, 3, 0, 6, 5, 4};
        var result = BubbleSort.sortOptimization(test);
        int[] waiting = {0, 1, 2, 3, 4, 5, 6};
        assertThat(result, is(waiting));
    }

    @Test
    public void zeroOpt() {
        int[] test = {0};
        var result = BubbleSort.sortOptimization(test);
        assertThat(result, is(test));
    }
}