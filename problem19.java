/*Given an array of integers and a target sum, find all unique pairs of elements in the array whose sum is equal to the given target.
Test case 01
Array: [1, 2, 3, 4, 5]
Target Sum: 7
Pairs:
(2, 5)
(3, 4)
Test case 02 
Array: [1, 2, 3]
Target Sum: 10
Pairs:
No pairs found.*/

import java.util.*;
public class problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
        	arr[i] = sc.nextInt();
        }
        System.out.println("Target Sum: ");
        int k = sc.nextInt();
        int i=0, j=1;
        int pairs = 0;
        Set<String> set = new HashSet<>();
        while(i<arr.length-1) {
        	if(arr[i] + arr[j] == k) {
        		String a = arr[i] + "," + arr[j];
        		if(!set.contains(a)) {
        			set.add(a);
        			System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            		pairs++;
        		}
        	}
        	j++;
        	if(j==arr.length) {
        		i++;
        		j = i+1;
        	}
        }
        if(pairs > 0) {
        	System.out.println("No. of pairs: " + pairs);
        }else {
        	System.out.println("No pairs");
        }
    }
}
