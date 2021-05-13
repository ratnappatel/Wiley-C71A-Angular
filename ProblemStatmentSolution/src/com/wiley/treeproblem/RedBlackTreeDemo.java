package com.wiley.treeproblem;

public class RedBlackTreeDemo {

	static Entry<Key,Object> root;
	
	public RedBlackTreeDemo() {
		root=new Entry<Key,Object>();
	}
	
	public void put(Key key,String value)
	{
		int flag=0;
		
		Entry<Key,Object> parent;
		Entry<Key,Object> e;
		
		//System.out.println(root);
		if(root.key==null)
		{
			 e=new Entry<Key,Object>(key,value);
			 e.key.color="black";
			 root=e;
		}
		else
		{
			parent=root;
			do
			{
				if(parent.key.data>key.data)
				{
					parent.key=parent.key.left;
					flag=0;
				}
				else if(parent.key.data<key.data)
				{
					flag=1;
					parent.key=parent.key.right;
				}
				else
					parent.setValue(value);
					
			}while(parent!=null);
			if(flag==0)
			{
				e=new Entry<Key,Object>(key,value);
				
				if(parent.key.color.equals("red"))
					e.key.color="black";
				else
					e.key.color="red";
				parent.key.left=e.key;
			}
			else if(flag==1)
			{
				e=new Entry<Key,Object>(key,value);
				
				if(parent.key.color.equals("red"))
					e.key.color="black";
				else
					e.key.color="red";
				parent.key.right=e.key;
			}
				
		}
		
	}
	public void inOrder(Key root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.println(root.data +" : "+root.color);
			inOrder(root.right);
		}
	}
	
	public static void main(String[] args) {
		RedBlackTreeDemo treeMap=new RedBlackTreeDemo();
		System.out.println("Map created..");
		treeMap.put(new Key(20),"First Element");
		treeMap.put(new Key(18), "Second Element");
		treeMap.put(new Key(67), "Third Element");
		treeMap.put(new Key(8), "Fourth Element");
		
		treeMap.inOrder(root.key);
	
	}

}
