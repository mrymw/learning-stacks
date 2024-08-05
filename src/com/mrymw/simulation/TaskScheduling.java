package com.mrymw.simulation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskScheduling {
   Queue<Task> taskQueue;

    public TaskScheduling() {
        this.taskQueue = new LinkedList<>();
    }
    public void addTask(String name, String description) {
        Task task = new Task(name, description);
        taskQueue.add(task);
        System.out.println(taskQueue);
    }
    public void processTask() {
        if(taskQueue.isEmpty()) {
            System.out.println("nothing to process, task queue is empty!");
        } else {
            Task task = taskQueue.poll();
            System.out.println("processed task: " + task);
        }
    }
    public void printSchedule() {
        if (taskQueue.isEmpty()) {
            System.out.println("nothing to print, task queue is empty!");
        } else {
            System.out.println("Pending Tasks: ");
            for (Task task: taskQueue) {
                System.out.println(task);
            }
        }
    }
}
