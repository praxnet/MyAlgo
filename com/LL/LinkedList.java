package com.LL;

class Node{
	
	public int data;
	public Node next;
	
	public Node(int data)
	{
		this.data=data;
	}
}

class LinkedList{
	
	public Node head;
	
	public int getSize()
	{
		if(isEmpty())
		{
			return 0;
		}
		Node temp = head;
		int size=0;
		
		while(temp!=null)
		{
			size++;
			temp=temp.next;
		}
		return size;
	}
	
	public boolean isEmpty()
	{
		return (head==null);
	}
	
	public void insertAtFront(int data)
	{
		Node n = new Node(data);
		
		if(isEmpty())
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}
	
	public void insertAtEnd(int data)
	{
		Node n = new Node(data);
		
		if(isEmpty())
		{
			head=n;
		}
		else
		{
			Node temp=head;

			while(temp.next != null)
				temp=temp.next;
			
			temp.next = n;
			n.next = null;
		}
	}
	
	public void insertAtPos(int data, int pos)
	{
		Node n = new Node(data);

		if(pos-1 > getSize())
		{
			System.out.println("Can't add to this position greater than size of Linked List");
			return;
		}
		
		if(isEmpty())
		{
			head=n;
			return;
		}
		
		if(pos==1)
		{	
			n.next=head;
			head=n;
			return;
		}

		Node curr = head;
		Node prev = null;
		
		int k = pos-1;
		
		while( (curr!=null) && ( k > 0 ) )
		{
			k--;
			prev=curr;
			curr=curr.next;
		}
		
		if(prev.next==null) //insert At End
		{	
			prev.next = n;
			n.next = null;
		} 
		else
		{
			prev.next=n;
			n.next=curr;
		}
	}
	
	public void deleteFromStart()
	{
		if(isEmpty())
			return ;
		
		Node temp = head;
		head=temp.next;
		temp=null;
	}
	
	public void deleteFromEnd()
	{
		if(isEmpty())
			return ;
		
		Node curr = head;
		Node prev = null;
		
		while(curr.next!=null)
		{
			prev=curr;
			curr=curr.next;
		}
		
		if(prev==null)  //if there is only one node in LinkedList
		{
			head = null;
		}
		else
		{
			prev.next=null;
			curr=null;
		}
	}
	
	public void deleteFromPos(int pos)
	{
		if(isEmpty())
			return;
		
		/*if(pos>getSize())
		{
			System.out.println("Position doesn't Exist");
			return;
		}*/
		
		if(pos==1)
		{	
			Node temp = head;
			head=temp.next;
			temp=null;
			return;
		}
		
		Node curr = head;
		Node prev = null;
		
		int k = pos-1;
		
		while( (curr!=null) && ( k > 0 ) )
		{
			k--;
			prev=curr;
			curr=curr.next;     //curr will be the node to be deleted
		}
		
		if(curr==null) //given position does not exist
		{	
			System.out.println("Can't Delete From Position Greater than Linked List Size...");
			return ;
		} 
		
		prev.next=curr.next;  // if curr is last node, then curr.next = null 
		curr=null;
	}
	
	public void reverseIterative()
	{
		Node currNode = head;
		Node prevNode = null;
		Node nextNode = null;
		
		while(currNode!=null)
		{
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head=prevNode;
	}

	public void reverseRecursive(Node p)
	{
		if(p==null)
			return ;
		
		if(p.next==null)
		{
			head =p;
			return;
		}
		
		reverseRecursive(p.next);
		Node q = p.next;
		q.next = p;
		p.next=null;
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
				System.out.print(temp.data+"-->");
				temp = temp.next;
			}
			System.out.print(temp.data);
		}
		System.out.println();
	}
}
