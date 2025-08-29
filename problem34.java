/*Given an array of strings, find the longest common prefix shared among them.
If no common prefix exists, return an empty string "".
Test Case 1 :
Input: ["flower","flow","flight"]
Output: fl
Test Case 2 :
Input: ["dog","racecar","car"]
Output: 
Test Case 3 :
Input: ["interspecies","interstellar","interstate"]
Output: inters*/

import java.util.*;
public class problem34 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String[] arr = new String[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = sc.next();
    	}
    	StringBuilder res = new StringBuilder();
    	int minlen = arr[0].length();
    	for(int i=1; i<n; i++) {
    		minlen = Math.min(minlen, arr[i].length());
    	}
    	for(int i=0; i<minlen; i++) {
    		char c = arr[0].charAt(i);
    		for(int j = 1; j<n; j++) {
    			char a = arr[j].charAt(i);
    			if(a != c) {
    				System.out.println(res.toString());
    				return;
    			}
    		}
    		res.append(c);
    	}
    	System.out.println(res.toString());
    }
}


