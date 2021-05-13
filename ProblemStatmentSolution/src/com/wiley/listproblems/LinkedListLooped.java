package com.wiley.listproblems;

import java.util.HashSet;

public class LinkedListLooped {

	static Node head;
	class Node implements Comparable<Node>
	{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		@Override
		public int compareTo(Node n) {
			
			return this.data-n.data;
		}
	}
	
	public void add(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
			head=newNode;
		else
		{
			Node temp=head;
			while(temp.next!=null)
					temp=temp.next;
			temp.next=newNode;
		}
	}
	
	public boolean detectLoop()
	{
		HashSet<Node>  nodes=new HashSet<Node>();
		Node curr=head;
		Node prev=null;
		while(curr!=null)
		{
			if(nodes.contains(curr))
			{
				System.out.println("Node Looping through "+prev.data+" <--> "+curr.data);
					return true;
			}
			
			nodes.add(curr);
			prev=curr;
			curr=curr.next;
			
		}
		return false;
		
	}
	public static void main(String[] args) {
		
		LinkedListLooped list=new LinkedListLooped();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		head.next.next.next.next.next=head.next;
		
		System.out.println("Loop Detected..."+list.detectLoop());

	}

}
