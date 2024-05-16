package com.tamoghna.leetcode.solutions;

import java.util.HashMap;

public class TwoSum {

	private static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> sum = new HashMap<Integer, Integer> ();

        for(int i = 0 ; i < nums.length; i++){
            if(sum.containsKey(target - nums[i])){
                return new int[] {i, sum.get(target - nums[i])};
            }
            sum.put(nums[i], i);
        }
        
        return new int[] {};
    }

	public static void main(String[] args) {
		
		int[] nums = new int[] {2,2,4,5,6};
		
		twoSum(nums, 6);

	}

}
