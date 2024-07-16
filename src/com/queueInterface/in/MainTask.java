package com.queueInterface.in;

public class MainTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  TaskManager taskManager = new TaskManager();

	        
	        taskManager.addTask(new Task(1, "Task 1", 3));
	        taskManager.addTask(new Task(2, "Task 2", 1));
	        taskManager.addTask(new Task(3, "Task 3", 2));
	        taskManager.addTask(new Task(4, "Task 4", 3)); 
	        taskManager.addTask(new Task(5, "Task 5", 1));
	        
	        System.out.print("LinkedList Queue: ");
	        System.out.println(taskManager.getLinkedListQueue());

	    
	        System.out.print("PriorityQueue: ");
	        System.out.println(taskManager.getPriorityQueue());

	   
	        System.out.print("ArrayDeque Queue: ");
	        System.out.println(taskManager.getArrayDequeQueue());
	   
	        
	        Task dequeuedLL = taskManager.getLinkedListQueue().poll();
	        System.out.print("Dequeued from LinkedList Queue: ");
	        System.out.println(dequeuedLL);

	    
	        Task dequeuedPQ = taskManager.getPriorityQueue().poll();
	        System.out.print("Dequeued from PriorityQueue: ");
	        System.out.println(dequeuedPQ);

	        Task dequeuedAD = taskManager.getArrayDequeQueue().poll();
	        System.out.print("Dequeued from ArrayDeque Queue: ");
	        System.out.println(dequeuedAD);
	   
		        Task peekLL = taskManager.getLinkedListQueue().peek();
		        System.out.print("Peek LinkedList Queue: ");
		        System.out.println(peekLL);
	
		     
		        Task peekPQ = taskManager.getPriorityQueue().peek();
		        System.out.print("Peek PriorityQueue: ");
		        System.out.println(peekPQ);
	
		        Task peekAD = taskManager.getArrayDequeQueue().peek();
		        System.out.print("Peek ArrayDeque Queue: ");
		        System.out.println(peekAD);
		        
		        
		    
		        Task task1LL = new Task(1, "Task 1", 3);
		        boolean existsLL = taskManager.getLinkedListQueue().contains(task1LL);
		        System.out.println("Task 1 exists in LinkedList Queue: " + existsLL);

		        
		        Task task4PQ = new Task(4, "Task 4", 3);
		        boolean existsPQ = taskManager.getPriorityQueue().contains(task4PQ);
		        System.out.println("Task 4 exists in PriorityQueue: " + existsPQ);

		        
		        Task task5AD = new Task(5, "Task 5", 1);
		        boolean existsAD = taskManager.getArrayDequeQueue().contains(task5AD);
		        System.out.println("Task 5 exists in ArrayDeque Queue: " + existsAD);

	}

}
