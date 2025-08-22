package placement;
import java.util.*;
public class problem31 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	for(int i=1; i<=n+1; i++) {
    		for(int j=0; j<n; j++) {
    			if(i == arr[j]) break;
    			if(j == n-1) {
    				System.out.println(i);
    				return;
    			}
    		}
    	}
    }
}

