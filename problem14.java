/*Given two strings, write a program to remove characters from the first string which are present in the second string.
Test case 1:
Input: String str1 = “abcdef”
           String str2 = “cefz”
Output: abd
Test case 2:
Input: String str1 = “xyzpw”
           String str2 = “lmno”
Output: xyzpw*/

import java.util.*;
public class problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter word: ");
        String a = sc.nextLine();
        System.out.println("enter second string:");
        String b = sc.nextLine();
        List<Character> list = new ArrayList<>();
        for(char c : a.toCharArray()) {
        	list.add(c);
        }
        for(char c : b.toCharArray()) {
        	if(list.contains(c)) {
        		list.remove(c);
        	}
        }
        System.out.println(list.toString());
    }
}
