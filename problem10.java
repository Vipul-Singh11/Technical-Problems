/*
You are given an integer. Your task is to replace all the zeros in the integer with ones.
Test Case 1:
Input: N = 102003
Output: 112113
Test Case 2:
Input:  204
Output: 214*/

import java.util.*;
public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        String a = Integer.toString(n);
        String b = a.replace('0', '1');
        n = Integer.parseInt(b);
        System.out.println(n);
    }
}
