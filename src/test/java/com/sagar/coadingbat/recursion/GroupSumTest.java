package com.sagar.coadingbat.recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
public class GroupSumTest {

    public GroupSum solution;

    @Before
    public void init(){
        solution = new GroupSum();
    }

    @Test
    public void testGroupSum_case(){
        boolean result;
        result = solution.groupSum(0, new int[]{2, 4, 8}, 10);
        assertTrue(result);
        result = solution.groupSum(0, new int[]{2, 4, 8}, 14);
        assertTrue(result);
        result = solution.groupSum(0, new int[]{2, 4, 8}, 9);
        assertFalse(result);
        result = solution.groupSum(0, new int[]{2, 4, 8}, 8);
        assertTrue(result);
        result = solution.groupSum(1, new int[]{2, 4, 8}, 8);
        assertTrue(result);
        result = solution.groupSum(1, new int[]{2, 4, 8}, 2);
        assertFalse(result);
        result = solution.groupSum(0, new int[]{1}, 1);
        assertTrue(result);
        result = solution.groupSum(0, new int[]{9}, 1);
        assertFalse(result);
        result = solution.groupSum(1, new int[]{9}, 0);
        assertTrue(result);
        result = solution.groupSum(0, new int[]{}, 0);
        assertTrue(result);
        result = solution.groupSum(0, new int[]{10, 2, 2, 5}, 17);
        assertTrue(result);
        result = solution.groupSum(0, new int[]{10, 2, 2, 5}, 15);
        assertTrue(result);
        result = solution.groupSum(0, new int[]{10, 2, 2, 5}, 9);
        assertTrue(result);
    }
}

