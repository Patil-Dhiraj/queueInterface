package com.queueInterface.in;

public class Task implements Comparable<Task> {
	
	private int id;
    private String description;
    private int priority;
    
		public Task(int id, String description, int priority) {
			super();
			this.id = id;
			this.description = description;
			this.priority = priority;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getPriority() {
			return priority;
		}

		public void setPriority(int priority) {
			this.priority = priority;
		}
    
		@Override
		public int compareTo(Task other) {
		   
		    if (this.priority < other.priority) {
		        return -1;  
		    } else if (this.priority > other.priority) {
		        return 1;  
		    } else {
		        return 0;   
		    }
		}
		 
		@Override
		 public String toString() {
		        return "Task{" +
		                "id=" + id +
		                ", description='" + description + '\'' +
		                ", priority=" + priority +
		                '}';
		    }
    	
}
