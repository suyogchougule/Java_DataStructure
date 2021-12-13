package Queue_DSP;

import java.util.Arrays;
import java.util.Scanner;
class MyQueue
{
	int[] arr;
	int front,rear;
	int capacity;
	int size;
	
	public MyQueue(int capacity)
	{
		this.front=0;
		this.rear=capacity-1;
		this.capacity=5;
		this.size=0;
		arr=new int[capacity];
	}
	private boolean isFull(MyQueue queue)
	{
		return queue.size==queue.capacity;
	}
	private boolean isEmpty(MyQueue queue)
	{
		return queue.front==queue.rear;
	}
	public void enqueue(int data)
	{
		if(isFull(this))
		{
			System.out.println("Queue is full");
		}
		this.rear=(this.rear+1)%this.capacity;
		this.arr[this.rear]=data;
		this.size++;
		System.out.println("Enqueue data:-"+data);
		
		//return data;
		
	}
	public void dequeue(int data)
	{
		if(isEmpty(this))
		{
			System.out.println("Queue is Empty.");
		}
		this.front=(this.front+1)%this.capacity;
		this.arr[this.front]=data;
		this.size--;
		System.out.println("Dequeue data:-"+data);
		
		//return data;
	}
	
	
	
}
	
public class Queue_P 
{

	public static void main(String[] args) 
	{
		MyQueue Queue=new MyQueue(5);
		Scanner sc=new Scanner(System.in);
		int val;
		boolean flag=true;
		while(flag)
		{
			int ch;
			System.out.println("1.Insert Eneque. 2.Dequeue. 3.View Queue. 4.Exit");
			System.out.println("Enter your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
					System.out.println("Enter value to add in queue");
					val=sc.nextInt();
					Queue.enqueue(val);
				break;
			case 2:
					System.out.println("Enter Dequeue item");
					val=sc.nextInt();
					Queue.dequeue(val);
					break;
			case 3:
					System.out.println(Arrays.toString(Queue.arr));
				break;
			case 4:
				flag=false;
				break;
				default:
					System.out.println("Wrong choice");
			}
		}
	}
}
