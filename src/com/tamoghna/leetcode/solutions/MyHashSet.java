package com.tamoghna.leetcode.solutions;

public class MyHashSet {

    ListNode curr;

    public MyHashSet() {
        curr = null;
    }

    public void add(int key) {
    	if(curr == null) {
    		curr = new ListNode(key);
    	} else {
    		if (!contains(key)) {
    			ListNode temp = curr;
                while (temp != null && temp.next != null) {
                	temp = temp.next;
                }
                temp.next = new ListNode(key);
            }
    	}
        
    }

    public void remove(int key) {
    	ListNode temp = curr;
        ListNode prev = curr;
        if (contains(key)) {
            while (temp != null && temp.next != null && temp.next.val == key) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            temp.next = null;
        }
    }

    public boolean contains(int key) {
    	ListNode temp = curr;
        while (temp != null) {
            if (temp.val == key) {
                return true;
            } else {
            	temp = temp.next;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {

    	MyHashSet myHashSet = new MyHashSet();
    	myHashSet.add(1);      // set = [1]
    	myHashSet.add(2);      // set = [1, 2]
    	myHashSet.contains(1); // return True
    	myHashSet.contains(3); // return False, (not found)
    	myHashSet.add(2);      // set = [1, 2]
    	myHashSet.contains(2); // return True
    	myHashSet.remove(2);   // set = [1]
    	myHashSet.contains(2); // return False, (already removed)
    }
}
