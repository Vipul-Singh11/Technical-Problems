/*You are given an array of integers. Return the length of the longest subarray with a sum equal to zero.
Test Case :
Input: [1, 2, -3, 3, -1, 2, -2]
Output: 3*/

import java.util.*;
public class problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        if(n==0) {
        	System.out.println(0);
        	return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(n==1 && arr[0]==0) {
        	System.out.println(1);
        	return;
        }
        int maxlength = 0;
        for(int i=0; i<n; i++) {
        	int sum = 0;
        	for(int j=i; j<n; j++) {
        		sum += arr[j];
        		if(sum == 0) {
        			maxlength = Math.max(maxlength, j-i+1);
        		}
        	}
        }
        System.out.println(maxlength);
        sc.close();
    }
}
