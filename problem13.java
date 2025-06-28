/*You are required to implement the following function:
Int Calculate(int m, int n);
The function accepts 2 positive integer ‘m’ and ‘n’ as its arguments.You are required to calculate the sum of numbers divisible both by 3 and 5, between ‘m’ and ‘n’ both inclusive and return the same.
Note
0 < m <= n
Test Case 
Input:
m : 12
n : 50
Output
90*/

import java.util.*;
public class problem13 {
	public static int Cal(int m, int n) {
		int sum = 0;
		for(int i=m; i<n; i++) {
			if(i%3 == 0 && i%5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m value: ");
        int m = sc.nextInt();
        System.out.println("enter n value: ");
        int n = sc.nextInt();
        System.out.println(Cal(m, n));
	sc.close();
    }
}
