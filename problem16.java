/*Given a string, write a program to Capitalize the first and last character of each word of that string.
Test Case 1:
Input: String str = "take u forward is awesome"
Output: “TakE U ForwarD IS AwesomE”*/

import java.util.*;
public class problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence: ");
        String a = sc.nextLine();
        String[] b = a.trim().split("\\s+");
        for(String word : b) {
        	if(word.length()==1) {
        		System.out.print(Character.toUpperCase(word.charAt(0)) + " ");
        	}else {
        		String c = Character.toUpperCase(word.charAt(0)) + word.substring(1, word.length()-1) + Character.toUpperCase(word.charAt(word.length()-1));
        		System.out.print(c + " ");
        	}
        }
        sc.close();
    }
}
