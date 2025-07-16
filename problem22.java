/*A chocolate factory produces premium chocolates with custom names printed on their wrappers. Due to a printing machine glitch, some letters are duplicated in the product name. As the quality assurance engineer, your job is to write a program that cleans up the product label by removing duplicate characters (while preserving the original character order).
Write a Java program that reads a product name and returns a version of the name with duplicate characters removed.
Input:
A string productName – the name printed on the chocolate box label (may contain duplicate characters, case-sensitive).
Output:
A string with all duplicate characters removed, keeping only the first occurrence of each character.
Test case 01 :
Input :
chococolate
Output :
cholate
Test case 02 :
Input :
darkchocolate
output :
darkcholte*/

import java.util.*;
public class problem22{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product name: ");
		String a = sc.nextLine().trim();
		Set<Character> set = new LinkedHashSet<>();
		for(int i=0; i<a.length(); i++) {
			set.add(a.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for(char c : set) {
			sb.append(c);
		}
		System.out.println(sb.toString());
	}
}
