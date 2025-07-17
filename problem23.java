/*You are planning a boat trip across a series of islands. The islands are arranged in a straight line and are numbered from 0 to N−1. Each island has a board that displays the maximum number of islands you can jump forward from there using your boat (based on the tide levels and wind).
You start at island 0, and your goal is to reach the last island (island N−1) using the minimum number of jumps.
Write a Java program to determine the minimum number of jumps required to reach the last island. If it's not possible, return -1.
Input: [2, 3, 1, 1, 4]
Output: 2*/

import java.util.*;
public class problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n <= 1) {
            System.out.println(0);
            return;
        }
        if (arr[0] == 0) {
            System.out.println("Not reachable");
            return;
        }
        int jumps = 1;
        int k = arr[0];
        int curr = arr[0];
        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                System.out.println(jumps);
                return;
            }
            k = Math.max(k, i + arr[i]);
            if (i == curr) {
                jumps++;
                curr = k;
                if (curr >= n - 1) {
                    System.out.println(jumps);
                    return;
                }
            }
        }
        System.out.println("Not reachable");
    }
}
