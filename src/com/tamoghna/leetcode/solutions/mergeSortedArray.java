package com.tamoghna.leetcode.solutions;

public class mergeSortedArray {

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0; i<nums2.length; i++){
            nums1[m+i] = nums2[i];
        }
       sort(nums1, 0, nums1.length-1);
    }

    private static void mergeSort(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    private static void sort(int arr[], int l, int r)
    {
        if (l < r) {

            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            mergeSort(arr, l, m, r);
        }
    }
	public static void main(String[] args) {
		
		int[] a = {1,2,3,0,0,0};
		int[] b = {2,5,6};
		
		merge(a, b.length, b, b.length);

	}

}
