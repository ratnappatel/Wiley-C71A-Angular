package com.wiley.datastructure;

import java.util.HashSet;

public class LinkedListFL {
	
	static Node head;
	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	
	public static void insert(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
			head=newNode;
		else
		{
			Node curr=head;
			while(curr.next!=null)
				curr=curr.next;
			curr.next=newNode;
		}		
	}
	public static void print()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	public static void mina()
	{
		LinkedListFL llist = new LinkedListFL();
		 
        llist.insert(20);
        llist.insert(4);
        llist.insert(15);
        llist.insert(10);
 
        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;
 
        if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
	}
	private static boolean detectLoop(Node head2) {
		
		HashSet<Node> visited=new HashSet<Node>();
		
		return false;
	}
	
}
