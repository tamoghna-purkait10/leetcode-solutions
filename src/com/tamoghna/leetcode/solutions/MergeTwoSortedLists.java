package com.tamoghna.leetcode.solutions;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class MergeTwoSortedLists {

	private static ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
		ListNode tempNode = new ListNode();
		ListNode tailNode = tempNode;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				tailNode.next = list1;
				list1 = list1.next;
			} else {
				tailNode.next = list2;
				list2 = list2.next;
			}
			tailNode = tailNode.next;
		}
		
		if (list1 != null) {
			tailNode.next = list1;
		} else if (list2 != null) {
			tailNode.next = list2;
		}

		return tempNode.next;
	}

	public static void main(String[] args) {

		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);

		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);

		ListNode mergedNode = mergeTwoSortedLists(list1, list2);

		while (mergedNode.next != null) {
			System.out.println(mergedNode.val);
			mergedNode = mergedNode.next;
		}

	}

}
