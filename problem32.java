/*Given a string s, count how many distinct substrings can be formed from it.
A substring is a contiguous sequence of characters inside a string.We only count unique substrings.
Test case 01 :
Input :
s = "ababa"
Substring are 
Output :
a, b, ab, ba, aba, bab, abab, baba, ababa
Total distinct = 9
Test case 02 :
Input :
s = "aaa"
Substring are 
Output :
a, aa, aaa
Total distincit = 3*/

import java.util.*;
public class problem32 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine().trim();
    	Set<String> set = new HashSet<>();
    	for(int i=0; i<str.length(); i++) {
    		StringBuilder substr = new StringBuilder();
    		for(int j=i; j<str.length(); j++) {
    			substr.append(str.charAt(j));
    			set.add(substr.toString());
    		}
    	}
    	for(String res : set) {
    		System.out.print(res + " ");
    	}
    	System.out.println();
    	System.out.println("Total distinct substrings :" + set.size());
    }
}


