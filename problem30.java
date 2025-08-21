/*Find All Subarrays with Given Sum
Given an array of integers and a target sum K, print all subarrays that sum to K.
Test Case 1:
Input: [1,2,3,4,2], K = 6 
Output: [1,2,3], [2,4]
Test Case 2 :
Input: [3,4,7,2,-3,1,4,2], K = 7 
Output: [3,4], [7], [7,2,-3,1], [1,4,2]*/

import java.util.*;
public class problem30 {
	public static void printarray(int[] arr, int s, int e) {
		System.out.print("[ ");
		for(int i=s; i<=e; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	int k = sc.nextInt();
    	Map<Integer, List<Integer>> map = new HashMap<>();
    	int sum = 0;
    	map.put(0, new ArrayList<>(Arrays.asList(-1)));
    	for(int i=0; i<n; i++) {
    		sum += arr[i];
    		if(map.containsKey(sum - k)) {
    			for(int idx : map.get(sum - k)) {
    				printarray(arr, idx+1, i);
    			}
    		}
    		map.computeIfAbsent(sum, x -> new ArrayList<>()).add(i);
    	}
    }
}


