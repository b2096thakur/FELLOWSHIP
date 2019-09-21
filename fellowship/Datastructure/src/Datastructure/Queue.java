package Datastructure;
import java.util.*;
class Queue{
	
	private int arr[];
	int rear = - 1;
	int front = - 1;
	int capacity;
	int count;
	Queue(int size) 
	{   
	int item;
	   arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	
	public void dequeue() {
	if (isEmpty()) {
System.out.println("UnderFlow\nProgram Terminated");
System.exit(1);
	}
System.out.println("Removing " + arr[front]);

		front = (front + 1) % capacity;
		count--;
	}

	
	public void enqueue(int item){
		if (isFull()){
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
			}
		System.out.println("Inserting " + item);

		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}

	
	
	
	public int size()
	{
		return count;
		
	}
	public int peek()
	{
		if (isEmpty()) 
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		return arr[front];
	}

	
	
	
	public Boolean isEmpty()
	{
		return (size() == 0);
	}

	
	public Boolean isFull()
	{
		return (size() == capacity);
	}
	
}
	