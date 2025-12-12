package com.lulu;

import org.junit.Test;
import static org.junit.Assert.*;

public class Solution5Test {

    @Test
    public void testExample1() {
        Solution5 solution = new Solution5();
        int[] nums = {3, 5, 6, 7};
        int target = 9;
        int expected = 4;
        int result = solution.numSubseq(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        Solution5 solution = new Solution5();
        int[] nums = {3, 3, 6, 8};
        int target = 10;
        int expected = 6;
        int result = solution.numSubseq(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        Solution5 solution = new Solution5();
        int[] nums = {2, 3, 3, 4, 6, 7};
        int target = 12;
        int expected = 61;
        int result = solution.numSubseq(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleElement() {
        Solution5 solution = new Solution5();
        int[] nums = {5};
        int target = 10;
        int expected = 1;
        int result = solution.numSubseq(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testAllElementsSatisfied() {
        Solution5 solution = new Solution5();
        int[] nums = {1, 1, 1, 1};
        int target = 10;
        int expected = 15;
        int result = solution.numSubseq(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testNoElementsSatisfied() {
        Solution5 solution = new Solution5();
        int[] nums = {10, 10, 10, 10};
        int target = 5;
        int expected = 0;
        int result = solution.numSubseq(nums, target);
        assertEquals(expected, result);
    }
}
