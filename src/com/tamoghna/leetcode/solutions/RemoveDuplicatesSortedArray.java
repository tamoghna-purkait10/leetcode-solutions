package com.tamoghna.leetcode.solutions;

public class RemoveDuplicatesSortedArray {
	
	private static int removeDuplicates (int[] nums) {
		int unique = nums[0];
        int length = 1;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != unique){
                unique = nums[i];
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
	}
	
	public static void main (String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
	}

}
