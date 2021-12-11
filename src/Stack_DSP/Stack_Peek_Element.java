package Stack_DSP;

public class Stack_Peek_Element 
{
	int top;
	int capacity;
	int[] stack;
	Stack_Peek_Element()
	{
		top=-1;
		capacity=10;
		stack=new int[capacity];
	}
	// Create a function stack is Empty or not
	public boolean isEmpty()
	{
		return top==-1;
	}
	//create a function for cheking stack is full or not
	public boolean isFull()
	{
		return top==capacity-1;
	}
	//Create a push() for insert data into stack
	public int push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		return stack[++top]=data;
	}
	
	// create a diaply() for display element into the stack
	public void dispaly()
	{
		for(int i:stack)
		{
			System.out.println(i);
		}
	}
	
	// Create a peek() to peek value into the stack top
	public	int peek()
	{
		return stack[top];
	}
	
	
	public static void main(String[] args) 
	{
		Stack_Peek_Element st= new Stack_Peek_Element();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		System.out.println("Stack is Empty:-"+st.isEmpty());
		System.out.println("Stack is Full:-"+st.isFull());
		System.out.println("Capcity of stack id:-"+st.capacity);
		System.out.println("Given Stack is");
		st.dispaly();
		System.out.println("Display element in stack top is:-"+st.peek());
		
		
		
		
		
		
		
		
		
		
	}

}
