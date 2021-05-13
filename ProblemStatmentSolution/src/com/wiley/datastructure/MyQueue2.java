package com.wiley.datastructure;

import java.util.Stack;

public class MyQueue2 {

	Stack<Integer> s1, s2;
	public MyQueue2() {
		s1=new Stack<Integer>();
		s2=new Stack<Integer>();
	}	
	public void enqueue(int x)
	{
		if(s1.isEmpty())
			s1.push(x);
		else
		{
			int a , b;
			while(!s1.isEmpty())
			{
				a= s1.pop();
				s2.push(a);
			}
			s1.push(x);
			while(!s2.isEmpty())
			{
				a=s2.pop();
				s1.push(a);
			}
		}
	}
	public int dequeue()
	{
		return s1.pop();
	}
	@Override
	public String toString()
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s1.size();i++)
			sb.append(s1.get(i)+" , ");
		
		return sb.toString();
	}
	public static void main(String[] args) {
		MyQueue2 queue=new MyQueue2();
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
