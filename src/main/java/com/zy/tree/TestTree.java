package com.zy.tree;

public class TestTree {

	
	public static void main(String[] args) {
		BinaryBalancedTree<Integer,Integer> tree = new BinaryBalancedTree<Integer,Integer>();
		
		tree.put(1, 1);
		tree.put(2, 2);
		tree.put(3, 3);
		tree.put(4, 4);
		
		System.out.println(tree.toString());
	}
}
