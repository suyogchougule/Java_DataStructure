package Stack_DSP;

public class Stackdemo 
{
	int top;
	int capacity;
	int[] stack;
	Stackdemo()
	{
		top=-1;
		capacity=10;
		stack=new int[capacity];
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
	
	public int peek()
	{
		return stack[top];
	}
	
	public int pop()
	{
		return stack[top--];
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stackdemo s1=new Stackdemo();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		
		System.out.println("Dispaly stacl elemnt");
		s1.display();
		
		System.out.println("Peek the Stack top element.");
		System.out.println(s1.peek());
		
		System.out.println("POP the stack top element.");
		System.out.println(s1.pop());
		
		System.out.println("Peek after POP element.");
		System.out.println(s1.peek());
		

	}

	
}
