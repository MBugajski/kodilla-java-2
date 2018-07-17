package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskname;
    final String where;
    final String using;
    boolean executed;

    public DrivingTask(String taskname, String where, String using) {
        this.taskname = taskname;
        this.where = where;
        this.using = using;
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
