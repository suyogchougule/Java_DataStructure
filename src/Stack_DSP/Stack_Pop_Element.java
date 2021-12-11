package Stack_DSP;

public class Stack_Pop_Element 
{
	int top;
	int capacity;
	int[] stack;
	Stack_Pop_Element()
	{
		top=-1;
		capacity=10;
		stack=new int[capacity];
	}
	
	//create a isEmpty() for checking stack is empty or not
	public boolean isEmpty() 
	{
		return top==-1;
	}
	
	// Create a isFull() for checking stack is full or not
	public boolean isFull()
	{
		return top==capacity-1;
	}
	
	//Create a push() for inserting element into the stack
	public int push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is Full");
		}
		return stack[++top]=data;
	}
	
	//Create a display() for display the elements into the stack
	public void display()
	{
		for(int i:stack)
		{
			System.out.println(i);
		}
		
	}
	
	//Create a pop() for remove/POP the stack top element
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		return stack[top--];
		
	}
	public static void main(String[] args)
	{
		Stack_Pop_Element sp=new Stack_Pop_Element();
		sp.push(1);
		sp.push(2);
		sp.push(3);
		sp.push(4);
		sp.push(5);
		
		System.out.println("Stack is empty ?:-"+sp.isEmpty());
		System.out.println("Stack is Full ?:-"+sp.isFull());
		System.out.println("Stack capaity is:-"+sp.capacity);
		System.out.println("Dispaly Stack element.");
		sp.display();
		
		System.out.println("POP element into stack:- "+sp.pop());
		System.out.println("Display the stack affter POP operation");
		sp.display();
		
		
	
	}

}
