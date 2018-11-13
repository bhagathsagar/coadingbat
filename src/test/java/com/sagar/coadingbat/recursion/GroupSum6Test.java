package com.sagar.coadingbat.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class GroupSum6Test {

    public GroupSum6 solution;

    @Before
    public void init(){
        solution = new GroupSum6();
    }

    @Test
    public void testGroupSum6(){

        boolean result;
        result = solution.groupSum6(0, new int[]{5, 6, 2}, 8) ;
        assertTrue(result);
        result = solution.groupSum6(0, new int[]{5, 6, 2}, 9) ;
        assertFalse(result);
        result = solution.groupSum6(0, new int[]{5, 6, 2}, 7) ;
        assertFalse(result);
        result = solution.groupSum6(0, new int[]{1}, 1) ;
        assertTrue(result);
        result = solution.groupSum6(0, new int[]{9}, 1) ;
        assertFalse(result);
        result = solution.groupSum6(0, new int[]{}, 0) ;
        assertTrue(result);
        result = solution.groupSum6(0, new int[]{3, 2, 4, 6}, 8) ;
        assertTrue(result);
        result = solution.groupSum6(0, new int[]{6, 2, 4, 3}, 8) ;
        assertTrue(result);
        result = solution.groupSum6(0, new int[]{5, 2, 4, 6}, 9) ;
        assertFalse(result);
        result = solution.groupSum6(0, new int[]{6, 2, 4, 5}, 9) ;
        assertFalse(result);
        result = solution.groupSum6(0, new int[]{3, 2, 4, 6}, 3) ;
        assertFalse(result);
        result = solution.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 12) ;
        assertTrue(result);
        result = solution.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 13) ;
        assertTrue(result);
        result = solution.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 4) ;
        assertFalse(result);
        result = solution.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 9) ;
        assertFalse(result);
        result = solution.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 14) ;
        assertTrue(result);
        result = solution.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 15) ;
        assertTrue(result);
        result = solution.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 16) ;
        assertFalse(result);
    }

}
