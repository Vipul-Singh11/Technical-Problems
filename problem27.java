package placement;
import java.util.*;
public class problem27 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the no. of elements:");
    	int n = sc.nextInt();
    	if(n==0) {
    		System.out.println("[]");
    		return;
    	}
    	int[] arr = new int[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	int[] arr2 = new int[n];
    	for(int i=0; i<n; i++) {
    		arr2[i] = -1;
    		for(int j=i+1; j<n; j++) {
    			if(arr[i] < arr[j]) {
    				arr2[i] = arr[j];
    				break;
    			}
    		}
    	}
    	System.out.print("[");
    	for(int i=0; i<n; i++) {
    		if(i<n-1) {
    			System.out.print(arr2[i]+", ");
    		}else {
    			System.out.print(arr2[i]);
    		}
    	}
    	System.out.print("]");
    }
}
