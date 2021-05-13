package com.wiley.datastructure;

import java.util.Stack;

// by making enqueue operation costly  oldest element -->stays at top


// by making dequeue operation costly 

public class MyQueue {
	
	Stack<Integer> s1,s2;
	public MyQueue() {
		s1=new Stack<Integer>();
		s2=new Stack<Integer>();
	}	
	
	public void enqueue(int x)
	{
		s1.push(x);
	}
	public int dequeue()
	{
		int a , b;
		while(!s1.isEmpty())
		{
			a= s1.pop();
			s2.push(a);
		}
		b=s2.pop();
		
		while(!s2.isEmpty())
		{
			a=s2.pop();
			s1.push(a);
		}
		return b;
	}

	@Override
	public String toString()
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s1.size();i++)
			sb.append(s1.get(i)+" , ");
		
		return sb.toString();
	}
	public static  void main(String args[])
	{
		MyQueue queue=new MyQueue();
		queue.enqueue(23);
		queue.enqueue(45);
		queue.enqueue(67);
		queue.enqueue(89);
		System.out.println(queue);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue);
	}
	
}
