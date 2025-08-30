/*We need to check if one string (s2) is a rotation of another string (s1).
A string s2 is a rotation of s1 if it can be obtained by moving some characters from the front of s1 to the back without changing their order.
Test Case 01:
Input: s1 = "waterbottle", s2 = "erbottlewat"
Output: true
Test Case 02:
Input: s1 = "hello", s2 = "llohe"
Output: true
Test Case 03 :
Input: s1 = "abc", s2 = "acb"
Output: false
Test Case 04 :
Input: s1 = "abc$123", s2 = "123abc$"
Output: true
Test Case 05  :
Input: s1 = "coding", s2 = "coding"
Output: true*/

import java.util.*;
public class problem35 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s1 = sc.next();
    	String s2 = sc.next();
    	if(s1.length() == s2.length() && (s2 + s2).contains(s1)) {
    		System.out.println("true");
    	}else {
    		System.out.println("false");
    	}
    	sc.close();
    }

}
