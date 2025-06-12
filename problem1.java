/*A supermarket wants to build a system to calculate the total bill for each customer who buys multiple items. The number of items a customer buys is unknown in advance.
The system should:
1.Ask the customer for the number of items they wish to buy.
2.For each item, ask for the item price.
3.Use aloop (choose the appropriate type) to read all item prices.
4.Finally, display the total amount to be paid by the customer.
Use proper loop logic to handle the dynamic number of items.
Note :
 - Use a for loop if the number of items is fixed at the start.
Sample Input :
Enter number of items: 4  
Enter price of item 1: 50  
Enter price of item 2: 30  
Enter price of item 3: 20  
Enter price of item 4: 100  
Sample Output :
Total bill: 200*/

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
