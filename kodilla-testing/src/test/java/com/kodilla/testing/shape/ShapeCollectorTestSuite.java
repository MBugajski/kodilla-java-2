package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of the tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Triangle(2, 3));
        //Then
        Assert.assertEquals(1, shapeCollector.getCollectionSize());
    }

    @Test
    public void testGetShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape theShape = new Square(1.2345);
        shapeCollector.addFigure(theShape);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.0000");
        String theFigure = theShape.getShapeName() + " with a field of: " + decimalFormat.format(theShape.getField());
        //When
        String retrievedFigure;
        retrievedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(theFigure, retrievedFigure);
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape theShape = new Circle(1.2);
        //When
        boolean result = shapeCollector.removeFigure(theShape);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigureExisting(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape theShape = new Circle(1.2);
        shapeCollector.addFigure(theShape);
        //When
        boolean result = shapeCollector.removeFigure(theShape);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getCollectionSize());
    }


}
