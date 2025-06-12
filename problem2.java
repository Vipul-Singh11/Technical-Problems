/*At the end of the day, your task is to sort these temperature readings in ascending order to generate a report showing how the temperature varied during the day from the lowest to the highest.
However, due to a legacy system limitation, you're required to use the Bubble Sort algorithm to perform the sorting.
Write a Java program that:
1.Accepts an array of temperature readings.
2.Sorts the array using Bubble Sort.
3.Displays the sorted readings.
Sample Test Case 01 :
Input:  {30, 25, 30, 20, 25}
Output: {20, 25, 25, 30, 30}
Sample test case 02 :
Input:  {32, 28, 35, 30, 25}
Output: {25, 28, 30, 32, 35}*/

import java.util.*;
public class problem2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the no. of readings: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter reading:");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
