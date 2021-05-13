package com.wiley.treeproblem;


class Key implements Comparable<Key>
{
	int data;
	Key left,right;
	String color;
	
	public Key(int data) {
		this.data=data;
		left=right=null;
		}
	@Override
	
	public int compareTo(Key o) {
		
		return this.data-o.data;
	}
	@Override
	public String toString() {
		return "Key [data=" + data + ", left=" + left + ", right=" + right + ", color=" + color + "]";
	}
	
}