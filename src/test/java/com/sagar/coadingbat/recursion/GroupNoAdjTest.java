package com.sagar.coadingbat.recursion;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
public class GroupNoAdjTest {

    public GroupNoAdj solution;

    @Before
    public void init(){
        solution = new GroupNoAdj();
    }

    @Test
    public void testGroupNoAdj() {
        boolean result;
        result = solution.groupNoAdj(0, new int[]{2, 5, 10, 4}, 12) ;
        assertTrue(result);
        result = solution.groupNoAdj(0, new int[]{2, 5, 10, 4}, 14) ;
        assertFalse(result);
        result = solution.groupNoAdj(0, new int[]{2, 5, 10, 4}, 7) ;
        assertFalse(result);
        result = solution.groupNoAdj(0, new int[]{2, 5, 10, 4, 2}, 7) ;
        assertTrue(result);
        result = solution.groupNoAdj(0, new int[]{2, 5, 10, 4}, 9) ;
        assertTrue(result);
        result = solution.groupNoAdj(0, new int[]{10, 2, 2, 3, 3}, 15) ;
        assertTrue(result);
        result = solution.groupNoAdj(0, new int[]{10, 2, 2, 3, 3}, 7) ;
        assertFalse(result);
        result = solution.groupNoAdj(0, new int[]{}, 0) ;
        assertTrue(result);
        result = solution.groupNoAdj(0, new int[]{1}, 1) ;
        assertTrue(result);
        result = solution.groupNoAdj(0, new int[]{9}, 1) ;
        assertFalse(result);
        result = solution.groupNoAdj(0, new int[]{9}, 0) ;
        assertTrue(result);
        result = solution.groupNoAdj(0, new int[]{5, 10, 4, 1}, 11) ;
        assertTrue(result);
    }


}
