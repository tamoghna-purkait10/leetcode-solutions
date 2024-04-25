package com.tamoghna.leetcode.solutions;

public class RemoveElement {

	public static int removeElement(int[] nums, int val) {
		int length = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[length] = nums[i];
				length++;
			}
		}

		return length;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		System.out.println(removeElement(nums, val));
	}

}
