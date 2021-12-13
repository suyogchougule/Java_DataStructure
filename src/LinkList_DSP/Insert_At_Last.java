package LinkList_DSP;
import java.util.Scanner;

class Node1
{
	private int data;
	private Node1 next;
	public Node1()
	{
		data=0;
		next=null;
	}
	public Node1(int d,Node1 n)
	{
		data=d;
		next=n;
	}
	public void setData(int val)
	{
		data=val;
	}
	public void setNext(Node1 n) 
	{
		next=n;
	}
	public int getData()
	{
		return data;
	}
	public Node1 getNext()
	{
		return next;
	}
}
class LinkListL
{
	private int size;
	private Node1 start;
	public LinkListL()
	{
		size=0;
		start=null;
	}
	public boolean isEmpty()
	{
		return start==null;
	}
	public void insertAtLast(int val)
	{
		Node1 n,t;
		n=new Node1();
		n.setData(val);
		
		t=start;
		if(t==null) 
		{
			start=n;
		}
		else
		{
			while(t.getNext()!=null)
			{
				t.getNext();
			}
			t.setNext(n);
		}
		size++;
	}
	public void getViewList()
	{
		Node1 t;
		if(isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			t=start;
			for(int i=1;i<=size;i++)
			{
				System.out.println(" "+t.getData());
				t=t.getNext();
			}
		}
		
	}
	
}


public class Insert_At_Last 
{

	public static void main(String[] args) 
	{
		LinkListL list=new LinkListL();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of list element");
		int val=sc.nextInt();
		list.insertAtLast(val);
		list.getViewList();
		

	}

}
