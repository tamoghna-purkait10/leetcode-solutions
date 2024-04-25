package com.tamoghna.leetcode.solutions;

//binary search O (log n)

public class SearchInsertPosition {

	private static int searchInsert(int[] nums, int target) {
		
		int low = 0, high = nums.length - 1, mid =0;
		
		if (target < nums[0]) {
			return 0;
		}
		
		while (low <= high) {
			mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				return mid;
			}

			if (nums[mid] < target) {
				low = mid + 1;
			}

			else {
				high = mid - 1;
			}
		}

		if(nums[mid] < target) {
			return mid+1;
		} 
		
		return mid;
	}

	public static void main(String[] args) {
		int[] num = {1,3};
		int target = 2;
		System.out.println(searchInsert(num, target));
	}

}
