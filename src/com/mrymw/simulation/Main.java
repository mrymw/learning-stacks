package com.mrymw.simulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskScheduling scheduling = new TaskScheduling();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add Task");
            System.out.println("2. Process Task");
            System.out.println("3. Print Schedule");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();  // Consume newline left-over
            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = input.nextLine();
                    System.out.print("Enter task description: ");
                    String description = input.nextLine();
                    scheduling.addTask(name, description);
                    break;
                case 2:
                    scheduling.processTask();
                    break;
                case 3:
                    scheduling.printSchedule();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
