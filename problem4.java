/*A cybersecurity firm has developed a login system where users must enter a "reverse password" as an added layer of security.
Each user's original password is securely stored.
During login, users must enter their password in reverse.
The system will reverse the input again and compare it with the stored original password to validate access.
Write a Java program that:
1.Takes the original password (stored value).
2.Takes user-entered reversed password (during login).
3.Reverses the user input.
4.Compares it with the stored password.
5.Displays login success/failure based on the match
Sample Input :
Stored Password: JavaSecure123
User Input:     321eruceSavaJ
Sample output :
Login Successful!*/

import java.util.*;
public class problem4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter password: ");
		String input = sc.nextLine();
		System.out.println("enter reverse password");
		String reverse = sc.nextLine();
		char[] arr = input.toCharArray();
		int n = arr.length;
		Boolean login = true;
		for(int i=0; i<reverse.length();  i++) {
			if(reverse.charAt(i) != arr[n-i-1]) {
				login = false;
			}
		}
		if(login) {
			System.out.println("login successful");
		}else {
			System.out.println("login unsuccessful");
		}
	}
}
