package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    final String taskname;
    final String whatToBuy;
    final double quantity;
    boolean executed;

    public ShoppingTask(String taskname, String whatToBuy, double quantity) {
        this.taskname = taskname;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing a task");
        this.executed = true;
    }

    @Override
    public String getTaskName() {
        return taskname;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
