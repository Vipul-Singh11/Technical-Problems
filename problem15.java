package placement;
import java.util.*;
public class problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
        	System.out.println("enter no: ");
        	arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int mid = n/2;
        int i=mid, j=n-1;
        while(i<j) {
        	int temp = arr[i];
        	arr[i] = arr[j];
        	arr[j] = temp;
        	i++;
        	j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
