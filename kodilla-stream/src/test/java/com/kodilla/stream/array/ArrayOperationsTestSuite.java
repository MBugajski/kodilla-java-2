package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9 ,8 ,7 ,6 ,5 ,4, 3, 2, 1};
        //When

        //Then
        Assert.assertEquals(5.5, ArrayOperations.getAverage(numbers), 0.001);
    }
}
