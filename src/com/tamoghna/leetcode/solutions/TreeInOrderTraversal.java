package com.tamoghna.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeInOrderTraversal {

	private static List<Integer> inorderTraversal(TreeNode root) {
		 List<Integer> list = new ArrayList<Integer>();

	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        TreeNode cur = root;

	        while (cur != null || !stack.empty()) {
	            while (cur != null) {
	                stack.add(cur);
	                cur = cur.left;
	            }
	            cur = stack.pop();
	            list.add(cur.val);
	            cur = cur.right;
	        }

	        return list;
	}

	public static void main(String[] args) {

		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(2, left, null);
		TreeNode root = new TreeNode(1, null, right);

		System.out.println(inorderTraversal(root));
	}
}