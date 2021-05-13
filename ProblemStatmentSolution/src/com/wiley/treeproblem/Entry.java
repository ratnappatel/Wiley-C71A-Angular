package com.wiley.treeproblem;
class Entry<Key,Object>
{
	Key key;
	Object value; 
	public Entry() {
		// TODO Auto-generated constructor stub
	}
	public Entry(Key key,Object value) {
		this.key=key;
		this.value=value;
	}
	public void setValue(Object value)
	{
		this.value=value;
	}
	@Override
	public String toString() {
		return "Entry [key=" + key.toString() + ", value=" + value + "]";
	}
	
}
