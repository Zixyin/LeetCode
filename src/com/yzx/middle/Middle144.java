package com.yzx.middle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Middle144 {
	public static void main(String[] args) {
		
	}
	class Solution {
	    public List<Integer> preorderTraversal(TreeNode root) {
	    	List<Integer> nodeList = new ArrayList<>();
	        if(root == null)
	        	return nodeList;
	    	LinkedList<TreeNode> stack = new LinkedList<>();
	        stack.offer(root);
	        while(!stack.isEmpty()) {
	        	root = stack.pollLast();
	            nodeList.add(root.val);
	        	if(root.right != null)
	        		stack.offerLast(root.right);
	        	if(root.left != null)
	        		stack.offerLast(root.left);
	        }
			return nodeList;
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

//  Definition for a binary tree node.



