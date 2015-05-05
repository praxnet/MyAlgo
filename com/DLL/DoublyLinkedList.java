package com.DLL;

class Node
{
	public int data;
	public Node next;
	public Node prev;
	
	public Node(int data)
	{
		this.data=data;
	}
}

public class DoublyLinkedList {
	
	public Node head;
	
	public boolean isEmpty()
	{
		return (head==null);
	}
	
	public int getSize()
	{
		if(isEmpty())
			return 0;
		
		int size=0;
		Node temp=head;
		while(temp!=null)
		{
			size++;
			temp=temp.next;
		}
		
		return size;
	}
	
	public void insertAtFront(int data)
	{
		Node n = new Node(data);
		if(isEmpty())
		{
			n.next = null;
			n.prev = null;
			head = n;
		}
		else
		{
			Node temp = head;

			temp.prev = n;
			
			n.next = temp;
			n.prev = null;
			head = n;
		}
	}
	
	public void insertAtEnd(int data)
	{
		Node n = new Node(data);
		
		if(isEmpty())
		{
			n.next = null;
			n.prev = null;
			head = n;
		}
		else
		{
			Node temp = head;
			
			while(temp.next !=null)
			{
				temp = temp.next;
			}
			
			temp.next = n;
			n.prev = temp;
			n.next = null;
		}
	}
	
	public void insertAtPos(int data,int pos)
	{
		Node n = new Node(data);
		
		if(pos-1 > getSize())
		{
			System.out.println("Can't Add to Position Greater than Doubly Linked List Size...");
			return;
		}
		
		if(isEmpty())
		{
			n.next = null;
			n.prev = null;
			head = n;
			return;
		}
		
		Node temp = head;
		
		if(pos==1)
		{
			temp.prev = n;
			n.next = temp;
			n.prev = null;
			head=n;
			return;
		}
		
		int x = pos-1;
		
		while( (temp.next!=null) && (x > 0 ) )
		{
			x--;
			temp=temp.next;         //temp will be the one after which we want to add the node 
		}
		
		if(temp.next==null) //Insert At End
		{
			n.next = null;
			n.prev = temp;
			temp.next = n;
			
		}
		else
		{
			n.next = temp.next;
			n.prev = temp;
			
			temp.next.prev = n; // Old Next of Temp 
			temp.next = n;
		}
}

	public void deleteFromFront()
	{
		if(isEmpty())
			return;
		
		Node temp = head;
		head = temp.next;
		
		if(head != null)  //For Doubly Linked List with only one node, head will be null
			head.prev = null;
		
		temp=null;
	}
	
	public void deleteFromEnd()
	{
		if(isEmpty())
			return;
		
		Node temp = head;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		//here, temp will be last node
		
		Node temp2 = temp.prev;
		temp2.next = null;
		
		temp = null;
		
	}
	
	public void deleteFromPos(int pos)
	{
		if(isEmpty())
			return;
		
		if(pos > getSize())
		{
			System.out.println("Can't Delete From Position Greater than Doubly Linked List Size...");
			return;
		}
		
		Node temp = head;
		
		if(pos==1)
		{
			head = temp.next;
			temp = null;
			return;
		}
		
		int x = pos-1;
		
		while( (temp.next!=null) && ( x > 0 ) ) 
		{
			x--;
			temp=temp.next;  // temp will be the node to be deleted
		}
		
		if(temp.next==null)  // Deletion of last node
		{
			Node temp2 = temp.prev;
			temp2.next = null;
			temp = null;
		}
		else
		{
			Node temp2 = temp.prev;
			
			temp2.next = temp.next;
			temp.next.prev = temp2;
			
			temp=null;
		}
		
	}
	
	public void display()
	{
		if(isEmpty())
			System.out.println("Empty List");
		else
		{
			Node temp = head;
			//System.out.println("---------"+head.data +" "+ head.next.data+"----------");
			while(temp.next!=null)
			{
				System.out.print(temp.data+"<==>");
				temp = temp.next;
			}
			System.out.print(temp.data);
		}
		System.out.println();
	}
}
