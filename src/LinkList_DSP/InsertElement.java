package LinkList_DSP;


public class LL 
{
	private Node head;
	private Node Tail;
	private int size;
	public LL()
	{
		this.size=0;
	}
	
	
	private class Node
	{
		private int value;
		private Node next;
		public Node(int value)
		{
			this.value=value;
			
		}
		public Node(int value,Node next)
		{
			this.value=value;
			this.next=next;
		}
	}
	public void insertFirst(int val)
	{
		Node node=new Node(val);
		node.next=head;
		head=node;
		if(Tail==null)
		{
			Tail=head;
		}
	}
	
}

public class InsertElement 
{ 
	public static void main(String[] args) 
	{
		LL list=new LL();
		
		
		
	}
	

}
