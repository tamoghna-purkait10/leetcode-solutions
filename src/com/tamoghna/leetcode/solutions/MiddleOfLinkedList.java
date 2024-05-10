package com.tamoghna.leetcode.solutions;

public class MiddleOfLinkedList {
	
	// TC O(n) and SC O(1)
	private static ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode curr = head;

        while (curr != null){
            length++;
            curr = curr.next;
        }

        int mid = (length / 2) + 1;

        for(int i = 1; i < mid; i++){
            head = head.next;
        }
        return head;
    }
	
	//Optimized with one pass only but takes more memory
	private static ListNode middleNode1(ListNode head) {
        
        ListNode fast = head, slow = head;

        while (fast != null){
           fast = fast.next.next;
           slow = slow.next;
        }

        return slow;
    }

	public static void main(String[] args) {
		
		ListNode newNode = new ListNode(1);
		newNode.next = new ListNode(0);
		newNode.next.next = new ListNode(0);
		newNode.next.next.next = new ListNode(1);
		newNode.next.next.next.next = new ListNode(0);
		newNode.next.next.next.next.next = new ListNode(0);
		
		middleNode(newNode);

	}

}
