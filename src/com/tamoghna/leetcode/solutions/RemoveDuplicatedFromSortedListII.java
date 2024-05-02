package com.tamoghna.leetcode.solutions;

public class RemoveDuplicatedFromSortedListII {

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		ListNode prev = head;

		while (current != null && current.next != null && prev.next != null) {
			if (current.val != prev.next.val) {
				prev = current;
				current = current.next;
			} else {
				ListNode temp = current;
				while(temp != null && temp.next != null && temp.val == temp.next.val) {
					temp = temp.next;
				}
				prev = temp.next;
				current.next = prev;
			}
		}

		return head;
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(3);
		list1.next.next.next = new ListNode(3);
		list1.next.next.next.next = new ListNode(4);
		list1.next.next.next.next.next = new ListNode(4);
		list1.next.next.next.next.next.next = new ListNode(5);

		ListNode finalNode = deleteDuplicates(list1);

		while (finalNode != null) {
			System.out.println(finalNode.val);
			finalNode = finalNode.next;
		}
	}

}
