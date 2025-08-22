/*First Missing Positive Integer
Find the smallest positive integer missing from the array.
Test Case 1:
Input: [1,2,0]
Output: 3
Test Case 2:
Input: [3,4,-1,1]
Output: 2
Test Case 3:
Input: [7, 8, 9, 11, 12]
Output: 1 
Test Case 4:
Input: [1, 2, 3, 4, 5]
Output: 6*/

import java.util.*;
public class problem31 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	for(int i=1; i<=n+1; i++) {
    		for(int j=0; j<n; j++) {
    			if(i == arr[j]) break;
    			if(j == n-1) {
    				System.out.println(i);
    				return;
    			}
    		}
    	}
    }
}


