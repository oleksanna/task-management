package com.example.taskmanagement.observer;

public class TaskNotifier implements TaskObserver {
    @Override
    public void onTaskUpdated(String task) {
        System.out.println("Уведомление: Задача добавлена - " + task);
    }
}
