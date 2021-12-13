package LinkList_DSP;
import java.util.Scanner;
class Node
{
	private int data;
	private Node next;
	public Node()
	{
		data=0;
		next=null;
	}
	public Node(int d,Node n)
	{
		data=d;
		next=n;
	}
	public void setdata(int d)
	{
		data=d;
	}
	public void setnext(Node n) 
	{
		next=n;
	}
	public int getdata()
	{
		return data;
	}
	public Node getnext()
	{
		return next;
	}
}

class LinkList 
{
	private int size;
	private Node start;
	public LinkList()
	{
		size=0;
		start=null;
	}
	public boolean isEmpty()
	{
		return start==null;
	}
	public int getListSize()
	{
		return size;
	}
	public void insertAtFirst(int val)
	{
		Node n;
		n=new Node();
		n.setdata(val);
		
		n.setnext(start);
		start=n;
		size++;
	}
	public void insertAtLast(int val)
	{
		Node n,t;
		n=new Node();
		n.setdata(val);
		t=start;
		
		if(t==null) 
		{
			start=n;
		}
		else
		{
			while(t.getnext()!=null)
			{
				t.getnext();
			}
			t.getnext();
		}
		size++;
	}
	public void insertAtPos(int val,int pos)
	{
		if(pos==1)
		{
			insertAtFirst(val);
		}else if(pos==size+1)
		{
			insertAtFirst(val);
		}else if(pos>1&&pos<=size)
		{
			Node n,t;
			n=new Node(val,null);
			t=start;
			for(int i=1;i<pos-1;i++)
			{
				t.getnext();
				n.setnext(t.getnext());
				t.setdata(val);
				size++;
			}
			
		}
	}
	public void deleteFirst()
	{
		if(start==null)
		{
			System.out.println("List is already empty");
		}
		else
		{
			start=start.getnext();
			size--;
		}
	}
	public void deleteLast()
	{
		if(start==null)
		{
			System.out.println("List is alredy empty");
		}
		else
		{
			if(size==1)
			{
				start=null;
				size--;
			}
			else
			{
				Node t;
				t=start;
				for(int i=1;i<size;i++)
				{
					t=t.getnext();
					size--;
				}
			}
		}
	}
	public void deleteAtPos(int pos)
	{
		if(start==null)
		{
			System.out.println("list is alredy Empty");
		}
		else if(pos<1 || pos>size)
		{
			System.out.println("Invalid position");
		}
		else if(pos==1)
		{
			deleteFirst();
		}else if(pos==size)
		{
			deleteLast();
		}
		else
		{
			Node t,t1;
			t=start;
			for(int i=1;i<pos-1;i++)
			{
				t=t.getnext();
			}
			t1=t.getnext();
			t.setnext(t1.getnext());
		}
	}
	public void getViewList()
	{
		Node t;
		if(isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			t=start;
			for(int i=1;i<=size;i++)
			{
				System.out.println(" "+t.getdata());
				t=t.getnext();
			}
		}
		
	}
}	
public class QueueAllOperationProgram 
{ 
	
	public static void main(String[] args) 
	{
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		
		LinkList list=new LinkList();
	
		while(flag)
		{
			System.out.println("1.Add element to the list");
			System.out.println("2.Add item to the list at last");
			System.out.println("3.add item to the list at position");
			System.out.println("4.Delete frit item from the list");
			System.out.println("5.Delete last item from the list");
			System.out.println("6.delete item from the list with given position");
			System.out.println("7.view List");
			System.out.println("8.exit");
			System.out.println("Enter Your Choice");
			int cho=sc.nextInt();
			int position,val = 0;
			switch(cho)
			{
			case 1:
				System.out.println("Enter value at list element");
				val=sc.nextInt();
				list.insertAtFirst(val);
				break;
			case 2:
				System.out.println("Add item to the list at last");
				val=sc.nextInt();
				list.insertAtLast(val);
				break;
			case 3:
				System.out.println("Add item to the list at position");
				position=sc.nextInt();
				System.out.println("Enter the value os list item");
				val=sc.nextInt();
				list.insertAtPos(val, position);
				break;
			case 4:
				list.deleteFirst();
				break;
			case 5:
				list.deleteLast();
				break;
			case 6:
				System.out.println("Enter position");
				position=sc.nextInt();
				list.deleteAtPos(position);
				break;
			case 7:
				list.getViewList();
				break;
			case 8:
				flag=false;
				break;
				default:
					System.out.println("Envalid choice");
				
			}
		}
	
		
		
		
	}
	

}
