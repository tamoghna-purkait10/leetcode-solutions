package com.tamoghna.leetcode.solutions;

public class ListNodeDLL {

	Object val;
	ListNodeDLL next;
	ListNodeDLL prev;

	ListNodeDLL() {
	}

	ListNodeDLL(Object val) {
		this.val = val;
	}

	ListNodeDLL(Object val, ListNodeDLL next, ListNodeDLL prev) {
		this.val = val;
		this.next = next;
		this.prev = prev;
	}

}
