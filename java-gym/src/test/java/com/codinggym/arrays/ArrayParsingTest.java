package com.codinggym.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayParsingTest {

    private ArrayParsing arrayParsing = new ArrayParsing();

    @Test
    public void testFindIndexForTargetSum(){

        assertArrayEquals(new int[] {0,1}, arrayParsing.findIndexForTargetSum(new int[] {2, 7, 11, 15}, 9));
        assertArrayEquals(new int[] {1,2}, arrayParsing.findIndexForTargetSum(new int[] {3, 2, 4}, 6));
        assertArrayEquals(new int[] {0,2}, arrayParsing.findIndexForTargetSum(new int[] {4, 3, 2}, 6));
        assertArrayEquals(new int[] {0,1}, arrayParsing.findIndexForTargetSum(new int[] {3, 3, 2}, 6));
        assertArrayEquals(new int[0], arrayParsing.findIndexForTargetSum(new int[] {1, 3, 2}, 6));
    }

}