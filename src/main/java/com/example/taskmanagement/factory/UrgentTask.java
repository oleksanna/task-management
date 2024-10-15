package com.example.taskmanagement.factory;

public class UrgentTask extends TaskFactory {
    @Override
    public String createTask(String description) {
        return "Срочная задача: " + description;
    }
}