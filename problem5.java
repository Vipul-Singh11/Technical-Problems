/*Day 15 - Corporate Questions - Technical Questions - 16.06.2025
Write a Java program to remove all duplicate characters from a string, preserving the original order of characters.
Test Case 1:
Input:
programming
Output:
progamin
Test Case 2:
Input:
abcABCabc
Output:
abcABC*/

import java.util.*;
public class problem5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Set<Character> set = new LinkedHashSet<>();
		for(char c : input.toCharArray()) {
			if(!set.contains(c)) {
				set.add(c);
			}
		}
		StringBuilder output = new StringBuilder();
		for(char c : set) {
			output.append(c);
		}
		System.out.println(output);
	}
}
