package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: Start");
    }

    @After
    public void after() {
        System.out.println("Test case: End");
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumberDalek dalek = new OddNumberDalek();
        Integer[] n1 = {1, 2, 3, 4, 5, 6};
        Integer[] n2 = {1, 3, 5};
        ArrayList<Integer> allNumbers = new ArrayList<>(Arrays.asList(n1));
        ArrayList<Integer> oddNumbers = new ArrayList<>(Arrays.asList(n2));
        System.out.println("Testing normal list");
        Assert.assertEquals(oddNumbers, dalek.exterminate(allNumbers));
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumberDalek dalek = new OddNumberDalek();
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println("Testing empty list");
        Assert.assertEquals(result, dalek.exterminate(emptyList));

    }
}
