package com.example.taskmanagement.factory;

import com.example.taskmanagement.service.TaskService;

public abstract class TaskFactory {
    public abstract String createTask(String description);
}