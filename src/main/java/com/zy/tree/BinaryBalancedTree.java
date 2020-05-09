package com.zy.tree;

import org.springframework.web.context.request.NativeWebRequest;

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
	  
	  /*右-左旋转*/
	  private Node rotateRightLeft(Node h) {
	        h.right = rotateRight(h.right);
	        return rotateLeft(h);
	   }
	  
	  
	  public void put(Key key, Value value) {
	        root = put(root, key, value);
	    }
	    
	    private Node put(Node h, Key key, Value value) {
	        if (h == null) return new Node(key, value);
	        int cmp = key.compareTo(h.key);
	        
	        if (cmp < 0) {
	            h.left = put(h.left, key, value);
	            if (height(h.left) - height(h.right) == 2) { //出现不平衡 只会是左子树比右子树高2
	                if (key.compareTo(h.left.key) < 0) { // h.左孩子的左子树
	                    h = rotateRight(h);  //对h进行右旋转
	                } else {
	                    h = rotateLeftRight(h); // 对h进行左-右旋转
	                }
	            }
	        } else if (cmp > 0) {
	            h.right = put(h.right, key, value);
	            if (height(h.right) - height(h.left) == 2) { //出现不平衡 只会是右子树比左子树高2
	                if (key.compareTo(h.right.key) > 0) { // h.右孩子的右子树
	                    h = rotateLeft(h);      //对h进行左旋转
	                } else {
	                    h = rotateRightLeft(h);
	                }
	            }
	        } else {  // 更新value
	            h.value = value;
	        }
	        
	        h.height = updateHeight(h);
	        return h;
	    }
	    
	    public void deleteMin() {
	        root = deleteMin(root);
	    }
	    
	    private Node deleteMin(Node h) {
	        if (h == null) return null;
	        if (h.left == null) return h.right;
	        h.left = deleteMin(h.left);
	        if (height(h.right) - height(h.left) == 2) {
	            h = rotateLeft(h);
	        } 
	        return h;
	    }

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			Node left = root.left;
			Node right = root.right;
			
			Value lv = left.value;
			Value rv = right.value;
			
			Value rootv = root.value;
			
			sb.append(rootv+"\n");
			sb.append("/");
			sb.append("\\"+"\n");
			sb.append(lv);
			sb.append(rv);
			
			return sb.toString();
		}
		
		

}
