/*Find the First Missing Positive Integer
Problem: Find the smallest positive integer missing from the array.
Input: [3, 4, -1, 1]
Output: 2*/

import java.util.HashSet;
import java.util.Scanner;
public class problem21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                set.add(arr[i]);
            }
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
