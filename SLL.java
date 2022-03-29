// Daniel Thompson
// 3/29/22
// This is my own work
package singlelyLinkedList;

public class SLL
{
	Node head;
	
	// Static class to create the nodes for the linked list
	static class Node
	{
		int data;
		Node next;
		
		Node(int d) {data = d; next = null;}
	}
	
	// O(n) - insert end method
	public static SLL insert(SLL list, int data)
	{
    // Creating a new node in order to store into the list in the right spot
		Node newNode = new Node(data);
		newNode.next = null;
		
    // Conditional for if this is a new list and has nothing in it
		if(list.head == null)
		{
			list.head = newNode;
		}
		else
		{
      // Ohterwise I create a placeholder and insert this into the end
			Node last = list.head;
			
      // Gpes until back of the list and then inserts the new node (last)
			while(last.next != null)
			{
				last = last.next;
			}
			
			last.next = newNode;
		}
		
		// Return the list
		return list;
	}
	
	
	// O(n) - Print method to check that my insert works correctly
	public static void printList(SLL list)
	{
		Node temp = list.head;
		
		System.out.print("LinkedList: ");
		
    // Pretty simple, run until it reaches the end and print out the data as the loop traverses the list
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			
			temp = temp.next;
		}
	}
	
	//  Main method
	public static void main(String[] args) {
		
		SLL list = new SLL();
		
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 9);
		list = insert(list, 20);
		list = insert(list, 30);
		list = insert(list, 14);
		
		printList(list);
	}
	
}
