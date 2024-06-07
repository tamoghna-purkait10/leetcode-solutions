package com.tamoghna.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayWithStack {
	
	private static List<String> buildArray(int[] target, int n) {
        List<String> ops = new ArrayList<String>();
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (index >= target.length) {
                break;
            }

            if (target[index] == i) {
                ops.add("Push");
                index++;
            } else {
                ops.add("Push");
                ops.add("Pop");
            }
        }

        return ops;
    }
	
	public static void main (String[] args) {
		
		int n = 3;
		int[] target = {1,3};
		
		System.out.println(buildArray(target, n));
	}

}
