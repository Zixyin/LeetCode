package com.yzx.middle;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class Middel145 {
	public static void main(String[] args) {
		
	}
	class Solution {
	    public List<Integer> preorderTraversal(TreeNode root) {
	    	List<Integer> list = new ArrayList<>();
	    	if(root == null)
	    		return list;
	    	Deque<TreeNode> stack = new LinkedList<>();
	    	TreeNode pre = null;
	    	while(root != null || !stack.isEmpty()) {
	    		while(root!= null) {
	    			stack.offerLast(root);
	    			root = root.left;
	    		}
	    		root = stack.pollLast();
	    		if(root.right == null || pre == root.right) {
	    			list.add(root.val);
	    			pre = root;
	    			root = null;
	    		} else {
	    			stack.offerLast(root);
	    			root = root.right;
	    		}
	    	}
	    	return list;
	    }
	}
	    class TreeNode {
	        int val;
	        TreeNode left;
	        TreeNode right;
	        TreeNode() {}
	        TreeNode(int val) { this.val = val; }
	        TreeNode(int val, TreeNode left, TreeNode right) {
	            this.val = val;
	          this.left = left;
	           this.right = right;
	      }
	  }
}
