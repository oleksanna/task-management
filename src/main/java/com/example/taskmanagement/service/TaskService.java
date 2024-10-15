package com.example.taskmanagement.service;

import com.example.taskmanagement.observer.TaskObserver;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private static TaskService instance;
    private List<TaskObserver> observers = new ArrayList<>();
    private List<String> tasks = new ArrayList<>(); // Список задач

    private TaskService() {}

    public static TaskService getInstance() {
        if (instance == null) {
            instance = new TaskService();
        }
        return instance;
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String task) {
        for (TaskObserver observer : observers) {
            observer.onTaskUpdated(task);
        }
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers(task); // Оповещаем наблюдателей о добавлении задачи
    }
}