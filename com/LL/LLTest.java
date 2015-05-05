package com.LL;

public class LLTest {

	public static void main(String[] args) {
	
		LinkedList L1 = new LinkedList();
		L1.insertAtFront(1);
		L1.insertAtFront(2);
		L1.insertAtFront(3);
		L1.insertAtFront(4);
		L1.insertAtFront(5);
		L1.insertAtFront(6);
		L1.insertAtEnd(0);
		L1.insertAtPos(100, 3);
		L1.display();
		L1.deleteFromPos(8);
		L1.display();
		
		L1.insertAtPos(108, 8);
		L1.display();
		
		L1.insertAtPos(111, 1);
		L1.display();
		
		L1.insertAtPos(88, 9);
		L1.display();
		/*L1.reverseIterative();
		L1.display();
		*/

		/*
		L1.reverseRecursive(L1.head);
		L1.display();
		*/
		
		/*
	    L1.deleteFromStart();
		L1.display();
		
		L1.deleteFromEnd();
		L1.display();
		
		L1.deleteFromStart();
		L1.display();
		*/
		
		L1.deleteFromPos(4);
		L1.display();
		
		L1.deleteFromPos(8);
		L1.display();
		
		L1.insertAtPos(144, 1);
		L1.display();
		
		L1.insertAtPos(1000, 4);
		L1.display();
		
		System.out.println(L1.getSize());
	}
}