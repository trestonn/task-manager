package com.treston.taskmanager;

import java.util.ArrayList;

public class TaskManager {
	private ArrayList<Task> tasks;
	
	public TaskManager() {
		tasks = new ArrayList<>();
	}
	
	public void addTask(Task task) {
		tasks.add(task);
	}
	
	public void removeTask(Task task) {
		tasks.remove(task);
	}
	
	public Task getTask(int index) {
		if (index >= 0 && index < tasks.size()) {
			return tasks.get(index);
		}
		return null;
	}
	
	public ArrayList<Task> getAllTasks() {
		return tasks;
	}
}
