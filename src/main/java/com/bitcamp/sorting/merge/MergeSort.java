import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
/**
*
* @author tarikcelik
*
*/
public class MergeSortApp {
public static void main(String[] args)throws IOException {
Scanner scan = new Scanner(System.in);
TextReader data =new TextReader(new FileReader("d:\\BIT CAMP\\MergeSortAppInputFile.txt"));
System.out.println("Merge Sort Test\n");
int n, i;
// read number of elements from file

n=data.getInt();
// Create array of n elements
int arr[] = new int[n];
 //read elements from file
for (i = 0; i < n; i++) {
	int br = data.getInt();
	arr[i]=br;
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
