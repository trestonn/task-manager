package com.treston.taskmanager;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TaskManager taskManager = new TaskManager();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Task MAnager");
			System.out.println("1. Add Task");
			System.out.println("2. Remove Task");
			System.out.println("3. View Tasks");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
				case 1:
					System.out.print("Enter task title: ");
					String title = scanner.nextLine();
					System.out.print("Enter task description: ");
					String description = scanner.nextLine();
					System.out.print("Enter task due date: ");
					String dueDate = scanner.nextLine();
					System.out.print("Enter task priority: ");
					String priority = scanner.nextLine();
			
					Task task = new Task(title, description, dueDate, priority);
					taskManager.addTask(task);
					System.out.println("Task added successfully!");
					break;
				case 2:
					System.out.print("Enter the index of the task to remove: ");
					int index = scanner.nextInt();
					scanner.nextLine();
					
					Task removedTask = taskManager.getTask(index);
					if (removedTask != null) {
						taskManager.removeTask(removedTask);
						System.out.println("Task removed successfully!");
					} else {
						System.out.println("Invalid task index!");
					}
					break;
				case 3:
					System.out.println("Tasks");
					for (Task t : taskManager.getAllTasks()) {
						System.out.println("Title: " + t.getTitle());
						System.out.println("Description: " + t.getDescription());
						System.out.println("Due Date: " + t.getDueDate());
						System.out.println("Priority: " + t.getPriority());
						System.out.println("--------------------");
					}
					break;
				case 4: 
					System.out.println("Exiting the program...");
					System.exit(0);
				default:
					System.out.println("Invalid choice! Please try again.");
			
			}
			
			
		}
		
	}

}
