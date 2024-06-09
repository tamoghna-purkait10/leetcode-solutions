package com.tamoghna.leetcode.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

	static Queue<Integer> counter = null;

	public RecentCounter() {
		RecentCounter.counter = new LinkedList<Integer>();
	}

	public int ping(int t) {
		counter.add(t);
		int rangeMin = t - 3000;
		while (counter.element() < rangeMin) {
			counter.remove();
		}
		System.out.println(counter);
		return counter.size();
	}

	public static void main(String[] args) {
		
		RecentCounter rc = new RecentCounter();
		rc.ping(642);
		rc.ping(1849);
		rc.ping(4921);
		rc.ping(5957);
		
		
	}

}
