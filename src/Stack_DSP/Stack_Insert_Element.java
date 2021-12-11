package Stack_DSP;

public class Stack_Insert_Element {
	int top;
	int capacity;
	int[] stack;
	Stack_Insert_Element()
	{
		top=-1;
		capacity=10;
		stack= new int[capacity];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top==capacity-1;
	}
	
	public int push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		return stack[++top]=data;
	}
	public void display()
	{
		for(int i:stack)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		Stack_Insert_Element stack=new Stack_Insert_Element();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.push(11);
		stack.push(12);
		
	
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		System.out.println(stack.capacity);
		stack.display();
	}

}
