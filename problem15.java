/*Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order
Test Case 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Test Case 2:
Input: 4 2 8 6 15 5 9 20
Output: 2 4 5 6 20 15 9 8*/

import java.util.*;
public class problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
        	System.out.println("enter no: ");
        	arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int mid = n/2;
        int i=mid, j=n-1;
        while(i<j) {
        	int temp = arr[i];
        	arr[i] = arr[j];
        	arr[j] = temp;
        	i++;
        	j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
