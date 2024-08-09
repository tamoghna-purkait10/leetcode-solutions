package com.tamoghna.leetcode.solutions;

public class SameTree {
	
	private static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

	public static void main(String[] args) {
		
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		TreeNode p = new TreeNode(1, left, right);
		
		TreeNode q_right = new TreeNode(3);
		TreeNode q = new TreeNode(1, null, q_right);

		System.out.println(isSameTree(p,q));

	}

}
