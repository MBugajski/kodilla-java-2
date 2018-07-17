package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    final String taskname;
    final String color;
    final String whatToPaint;
    boolean executed;

    public PaintingTask(String taskname, String color, String whatToPaint) {
        this.taskname = taskname;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
