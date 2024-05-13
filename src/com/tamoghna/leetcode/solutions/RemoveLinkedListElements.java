package com.tamoghna.leetcode.solutions;

public class RemoveLinkedListElements {
	
	private static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

	public static void main(String[] args) {
		
		ListNode newNode = new ListNode(1);
		newNode.next = new ListNode(2);
		newNode.next.next = new ListNode(7);
		newNode.next.next.next = new ListNode(5);
		newNode.next.next.next.next = new ListNode(5);
		newNode.next.next.next.next.next = new ListNode(6);
		newNode.next.next.next.next.next.next = new ListNode(7);
		
		removeElements(newNode, 7);
	}

}
