package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BoardConfig {

    @Bean
    public Board board(TaskList task1, TaskList task2, TaskList task3) {
        return new Board(task1, task2, task3);
    }

    @Bean(name = "task1")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "task2")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "task3")
    @Scope("prototype")
    public TaskList getDoneList() { return new TaskList();
    }

}
