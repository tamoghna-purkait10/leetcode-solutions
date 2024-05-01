package com.tamoghna.leetcode.solutions;

public class RemoveDuplicatesFromSortedList {

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode temp = head;  // always set the head to a temp node
        while(temp!= null && temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(2);
		list1.next.next.next = new ListNode(4);

		ListNode finalNode = deleteDuplicates(list1);

		while (finalNode != null) {
			System.out.println(finalNode.val);
			finalNode = finalNode.next;
		}
	}

}
