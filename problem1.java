import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of items:");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter price of item " + (i+1) + ":" );
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("total bill: " + sum);
  }
}