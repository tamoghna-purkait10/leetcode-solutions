package com.tamoghna.leetcode.solutions;

// Below solution has time complexity of O(max(m,n)) where m,n is the length of the linked lists l1 and l2 respectively
// Space complexity of O(1)

public class AddTwoNumbers {

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode resultList = new ListNode();

		ListNode l1_curr = l1;
		ListNode l2_curr = l2;
		ListNode resultList_curr = resultList;
		int carry = 0;

		while (l1_curr != null && l2_curr != null && resultList_curr != null) {
			int sum = carry + l1_curr.val + l2_curr.val;

			if (sum > 9) {
				resultList_curr.val = sum - 10;
				carry = 1;
			} else {
				resultList_curr.val = sum;
				carry = 0;
			}
			if (carry == 1) {
				resultList_curr.next = new ListNode(carry);
			} else {
				if (l1_curr.next != null || l2_curr.next != null) {
					resultList_curr.next = new ListNode(0);
				}
			}

			resultList_curr = resultList_curr.next;

			if (l2_curr.next != null) {
				l2_curr = l2_curr.next;
			} else {
				l2_curr.val = 0;
			}
			if (l1_curr.next != null) {
				l1_curr = l1_curr.next;
			} else{
				l1_curr.val = 0;
			}

		}
		return resultList;
	}

	public static void main(String[] args) {

		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(9);
		l1.next.next.next = new ListNode(9);
		l1.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next.next = new ListNode(9);

		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);

		addTwoNumbers(l1, l2);

	}

}
