package com.sagar.coadingbat.recursion;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class GroupSum5Test {

    public GroupSum5 solution;

    @Before
    public void init(){
        solution = new GroupSum5();
    }

    @Test
    public void testGroupSum5() {
        boolean result;
        result = solution.groupSum5(0, new int[]{2, 5, 10, 4}, 19) ;
        assertTrue( result);
        result = solution.groupSum5(0, new int[]{2, 5, 10, 4}, 17) ;
        assertTrue( result);
                result = solution.groupSum5(0, new int[]{2, 5, 10, 4}, 12) ;
        assertFalse( result);
        result = solution.groupSum5(0, new int[]{2, 5, 4, 10}, 12) ;
        assertFalse( result);
                result = solution.groupSum5(0, new int[]{3, 5, 1}, 4) ;
        assertFalse( result);
                result = solution.groupSum5(0, new int[]{3, 5, 1}, 5) ;
        assertTrue( result);
        result = solution.groupSum5(0, new int[]{1, 3, 5}, 5) ;
        assertTrue( result);
        result = solution.groupSum5(0, new int[]{3, 5, 1}, 9) ;
        assertFalse( result);
        result = solution.groupSum5(0, new int[]{2, 5, 10, 4}, 7) ;
        assertFalse( result);
        result = solution.groupSum5(0, new int[]{2, 5, 10, 4}, 15) ;
        assertTrue( result);
        result = solution.groupSum5(0, new int[]{2, 5, 10, 4}, 11) ;
        assertFalse( result);
        result = solution.groupSum5(0, new int[]{1}, 1) ;
        assertTrue( result);
        result = solution.groupSum5(0, new int[]{9}, 1) ;
        assertFalse( result);
        result = solution.groupSum5(0, new int[]{9}, 0) ;
        assertTrue( result);
        result = solution.groupSum5(0, new int[]{}, 0) ;
        assertTrue( result);

    }

}
