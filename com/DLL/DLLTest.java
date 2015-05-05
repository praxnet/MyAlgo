package com.DLL;

public class DLLTest {

	public static void main(String[] args) {
		
		DoublyLinkedList dl1 = new DoublyLinkedList();
	
		dl1.insertAtFront(1);
		dl1.insertAtFront(2);
		dl1.insertAtFront(3);
		dl1.insertAtFront(4);
		dl1.insertAtFront(5);
		dl1.insertAtFront(6);
		dl1.insertAtEnd(0);
		dl1.display();
		
		dl1.insertAtPos(8, 8);
		dl1.display();
				
		dl1.insertAtPos(44, 9);
		dl1.display();
		
		dl1.deleteFromPos(4);
		dl1.display();
		dl1.deleteFromPos(8);
		dl1.display();
		System.out.println();
		//int i = dl1.getSize();
		
		while(true)
		{
			if(dl1.isEmpty())
				break;
			dl1.deleteFromPos(dl1.getSize());
		
			dl1.display();
		}
		
		System.out.println(dl1.getSize());
	}
}
