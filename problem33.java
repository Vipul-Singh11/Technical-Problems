/*Given an unsorted array of integers, return the length of the longest consecutive sequence of numbers.
Consecutive means numbers appear one after another (like 1,2,3,4).
The order in the array doesn’t matter.
You need to do it in O(n) time.
Test Case 01 :
Input: [100, 4, 200, 1, 3, 2]
Output : 4
Test Case 02 :
Input: [0,3,7,2,5,8,4,6,0,1]
Outuput : 9*/

import java.util.*;
public class problem33 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	Set<Integer> set = new HashSet<>();
    	for(int num : arr) {
    		set.add(num);
    	}
    	int longest = 0;
    	for(int num : set) {
    		if(!set.contains(num-1)) {
    			int curr = num;
    			int count = 1;
    			while(set.contains(curr + 1)) {
        			curr++;
        			count++;
        		}
    			longest = Math.max(longest, count);
    		}
    	}
    	System.out.println("Longest sequence :" + longest);
    }
}


