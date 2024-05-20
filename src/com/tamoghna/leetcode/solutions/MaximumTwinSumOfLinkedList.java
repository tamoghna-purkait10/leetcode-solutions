package com.tamoghna.leetcode.solutions;

public class MaximumTwinSumOfLinkedList {
	
	 private static int pairSum(ListNode head) {
	        
	        ListNode fast = head, slow = head;

	        while(fast != null && fast.next != null){
	            fast = fast.next.next;
	            slow = slow.next;
	        }

	        ListNode prev = null, newNode = null;

	        while(slow != null){	 // reversing the linked list
	            newNode = slow.next; // saving next node of current slow in new node
	            slow.next = prev;    // assigning prev to next of slow
	            prev = slow;         // update prev to point to slow
	            slow = newNode;      // update slow to point new node
	        }

	        int maxSum = 0;

	        while(prev != null){
	            maxSum = Math.max(maxSum, head.val + prev.val);
	            head = head.next;
	            prev = prev.next;
	        }

	        return maxSum;
	    }

	public static void main(String[] args) {
		
		ListNode newNode = new ListNode(5);
		newNode.next = new ListNode(4);
		newNode.next.next =  new ListNode(2);
		newNode.next.next.next =  new ListNode(1);

		System.out.println(pairSum(newNode));
	}

}
