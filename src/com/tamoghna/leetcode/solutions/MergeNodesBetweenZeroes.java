package com.tamoghna.leetcode.solutions;

public class MergeNodesBetweenZeroes {
	
	//TC O(n) SC O(1)
	private static ListNode mergeNodes(ListNode head) {

		int sum = 0;

        ListNode curr = head;
        ListNode prev = head;

        //keep updating the first nodes until tail is encountered. then drop rest of the list.
        while(curr.next != null){
            sum += curr.val;
            if(curr.next.next != null && curr.next.val == 0){
                prev.val = sum;
                prev = prev.next;
                sum = 0;
            }
            curr = curr.next;
        }
        prev.val = sum;
        prev.next = null;

        return head;
	}

	public static void main(String[] args) {
		
		ListNode newNode = new ListNode(0);
		newNode.next = new ListNode(3);
		newNode.next.next = new ListNode(1);
		newNode.next.next.next = new ListNode(0);
		newNode.next.next.next.next = new ListNode(4);
		newNode.next.next.next.next.next = new ListNode(5);
		newNode.next.next.next.next.next.next = new ListNode(2);
		newNode.next.next.next.next.next.next.next = new ListNode(0);
		
		mergeNodes(newNode);

	}

}
