package com.tamoghna.leetcode.solutions;

public class InsertGCDLinkedList {

	
	// TC O(n) and SC O(n) - 38 Ms runtime.
	private static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        ListNode gcdNode = null;

        while(curr != null && curr.next != null){
            gcdNode = new ListNode(findGcd(curr.val, curr.next.val));
            gcdNode.next = curr.next;
            curr.next = gcdNode;
            curr = curr.next.next;
        }

        return head;
    }

    private static int findGcd(int a, int b){
        int max = a > b ? a : b;

        for(int i=max; i>0; i--){
            if(a%i == 0 && b%i == 0){
                return i;
            }
        }
        
        return 1;
    }
    
	public static void main(String[] args) {
		
		ListNode newNode = new ListNode(18);
		newNode.next = new ListNode(6);
		newNode.next.next = new ListNode(10);
		newNode.next.next.next = new ListNode(3);
		
		insertGreatestCommonDivisors(newNode);
	}

}
