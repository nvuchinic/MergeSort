package com.bitcamp.sorting.merge;

import java.util.Scanner;

/**
 * 
 * @author tarikcelik
 * 
 */
public class MergeSort {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Merge Sort Test\n");
		int n, i;
		
		// Accept number of elements
		System.out.println("Enter number of integer elements");
		n = scan.nextInt();
		
		// Create array of n elements
		int arr[] = new int[n];
		
		/* Accept elements */
		System.out.println("\nEnter " + n + " integer elements");
		for (i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
			
		// Call method sort 
		sort(arr, 0, arr.length);
		
		// Print sorted Array 
		System.out.println("\nElements after sorting ");
		for (i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	/***
	 * This is the Merge-sort function 
	 * @param a
	 * @param low
	 * @param high
	 */
	public static void sort(int[] a, int low, int high) {
		
		int N = high - low;
		if (N <= 1) {
			return;
		} 
			
		
		int mid = low + N / 2;
		
		// Recursively sort
		sort(a, low, mid);
		sort(a, mid, high);
		
		// Merge two sorted subarrays
		int[] temp = new int[N];
		int i = low, j = mid;
		
		for (int k = 0; k < N; k++) {
			if (i == mid) {
				System.out.println("\nValue of i: " + i);
				System.out.println("\nValue of mid: " + mid);
				temp[k] = a[j++];
			} else if (j == high) {
				System.out.println("\nValue of j: " + j);
				System.out.println("\nValue of high: " + high);
				temp[k] = a[i++];
			} else if (a[j] < a[i]) {
				System.out.println("\nValue of a[j]: " + a[j]);
				System.out.println("\nValue of a[i]: " + a[i]);
				temp[k] = a[j++];
			} else {
				temp[k] = a[i++];
			}	
		}
		
		for (int k = 0; k < N; k++) {
			a[low + k] = temp[k];
		}
			
	}
}
