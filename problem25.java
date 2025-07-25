/*Given an array of integers arr[] where each element represents the maximum number of steps that can be made forward from that element. Write a program to return the minimum number of jumps to reach the end of the array (starting from the first element). If the end isn't reachable, return -1.
Input :
arr = {2, 3, 1, 1, 4}
Output :
Minimum Jumps = 2*/

import java.util.*;
public class problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 0) {
            System.out.println(-1);
            return;
        }
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;
        if (n == 1) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                System.out.println(jump);
                return;
            }
            maxReach = Math.max(maxReach, i + arr[i]);
            step--;
            if (step == 0) {
                jump++;
                if (i >= maxReach) {
                    System.out.println(-1);
                    return;
                }
                step = maxReach - i;
            }
        }
    }
}
