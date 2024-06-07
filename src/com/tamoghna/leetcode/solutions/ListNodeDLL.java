package com.tamoghna.leetcode.solutions;

public class ListNodeDLL {

	Object val;
	ListNodeDLL next;
	ListNodeDLL prev;
	
	

	public ListNodeDLL() {
	}

	public ListNodeDLL(Object val) {
		this.val = val;
	}

	public ListNodeDLL(Object val, ListNodeDLL next, ListNodeDLL prev) {
		this.val = val;
		this.next = next;
		this.prev = prev;
	}

}
