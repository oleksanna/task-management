package com.example.taskmanagement;

import com.example.taskmanagement.service.TaskService;

public class TaskManagementApplication {
    public static void main(String[] args) {
        TaskService taskService = TaskService.getInstance();

        // Добавление задач
        taskService.addTask("Первая задача");
        taskService.addTask("Вторая задача");

        // Пример оповещения
        taskService.addObserver(task -> System.out.println("Задача обновлена: " + task));
        taskService.addTask("Третья задача");
    }
}