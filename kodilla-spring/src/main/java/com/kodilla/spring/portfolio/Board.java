package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

@Component
public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void readBoard(){
        System.out.println("To do: ");
        toDoList.readTasks();
        System.out.println("In progress: ");
        inProgressList.readTasks();
        System.out.println("Done: ");
        doneList.readTasks();
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

}
