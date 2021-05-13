package com.wiley.datastructure;
import java.util.concurrent.atomic.AtomicInteger;

// A class to store a BST node
class Node
{
	int data;
	Node left = null, right = null;

	Node(int data) {
		this.data = data;
	}
}

class Main
{
	// Recursive function to insert a key into a BST
	public static Node insert(Node root, int key)
	{
		// if the root is null, create a new node and return it
		if (root == null) {
			return new Node(key);
		}

		// if the given key is less than the root node, recur for the left subtree
		if (key < root.data) {
			root.left = insert(root.left, key);
		}

		// if the given key is more than the root node, recur for the right subtree
		else {
			root.right = insert(root.right, key);
		}

		return root;
	}

	// Function to find the k'th smallest element in the BST.
	// Here, `i` denotes the total number of nodes processed so far
	public static int kthSmallest(Node root, AtomicInteger i, int k)
	{
		// base case
		if (root == null) {
			return Integer.MAX_VALUE;
		}

		// search in the left subtree
		int left = kthSmallest(root.left, i, k);

		// if k'th smallest is found in the left subtree, return it
		if (left != Integer.MAX_VALUE) {
			return left;
		}

		// if the current element is k'th smallest, return its value
		if (i.incrementAndGet() == k) {
			return root.data;
		}

		// otherwise, search in the right subtree
		return kthSmallest(root.right, i, k);
	}

	// Function to find the k'th smallest element in the BST.
	public static int kthSmallest(Node root, int k)
	{
		// maintain index to count the total number of nodes processed so far
		AtomicInteger i = new AtomicInteger(0);

		// traverse the tree in an inorder fashion and return k'th element
		return kthSmallest(root, i, k);
	}

	public static void main(String[] args)
	{
		int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

		Node root = null;
		for (int key: keys) {
			root = insert(root, key);
		}

		int k = 2;
		int result = kthSmallest(root, k);

		if (result != Integer.MAX_VALUE) {
			System.out.print(result);
		}
		else {
			System.out.print("Invalid Input");
		}
		
		
	}
}