package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testTaskCreation() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("shop", shopping.getTaskName());
    }

    @Test
    public void testTaskExecution() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painging = factory.makeTask(TaskFactory.PAINTING);
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals(false, painging.isTaskExecuted());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }
}
