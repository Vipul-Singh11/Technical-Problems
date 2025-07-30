/*Given an integer n, generate the nth term in the "Count and Say" sequence.
Input: n = 4
Output: "1211"*/

import java.util.*;
public class problem28 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter input: ");
    	int n = sc.nextInt();
    	if(n==1) {
    		System.out.println(1);
    		sc.close();
    		return;
    	}
    	String prev = "1";
    	for(int i=2; i<=n; i++) {
    		StringBuilder sb = new StringBuilder();
    		int count = 1;
    		for(int j=1; j<prev.length(); j++) {
    			if(prev.charAt(j) == prev.charAt(j-1)) {
    				count++;
    			}else {
    				sb.append(count).append(prev.charAt(j-1));
    				count = 1;
    			}
    		}
    		sb.append(count).append(prev.charAt(prev.length()-1));
    		prev = sb.toString();
    	}
    	System.out.println(prev);
    	sc.close();
    }
}
