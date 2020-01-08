package com.zy.tree;

/**
 * 二叉平衡树
 * @author wanglei
 *
 */
public class BinaryBalancedTree<Key extends Comparable<Key>,Value> {
	
	
	private Node root;
	
	  private class Node {
	        Key key;
	        Value value;
	        Node left, right;
	        int height;
	        
	        public Node(Key key, Value value) {
	            this.key = key;
	            this.value = value;
	        }
	        
	        public String toString() {
	            return "[" + key + "," + value + "," + height + "]";
	        }
	    }
	  
	  
	  private int height(Node h) {
	        return h == null ? -1 : h.height;
	    }
	    
	  private int updateHeight(Node h) {
	        return Math.max(height(h.left), height(h.right)) + 1;
	   }
	  
	  /**右旋**/
	  private Node rotateRight(Node h) {
		  
		  /**
		   * 右旋的话，就是自己变成左子树的右孩子
		   */
		  Node x = h.left;	
		  x.right = h;
		  
		  h.height = updateHeight(h);
		  x.height = updateHeight(x);
		  
		  return x;
	  }
	  
	  /**左旋**/
	  private Node rotateLeft(Node h) {
		  
		  
		  /**
		   * 左旋的话，就是自己变成子树的左孩子
		   */
		  Node x = h.right;
		  x.left = h;
		  h.height = updateHeight(h);
		  x.height = updateHeight(x);
		  
		  return x;
	  }
	  
	  /*左-右旋转*/
	  private Node rotateLeftRight(Node h) {
	        h.left = rotateLeft(h.left);
	        return rotateRight(h);
	    }

}
