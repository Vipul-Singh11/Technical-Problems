package placement;
import java.util.*;
public class problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
        	arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int num : arr) {
        	sum += num;
        }
        Arrays.sort(arr);
        int power = 0;
        for(int i=n-1; i>=0; i--) {
        	power += arr[i];
        	if(power > sum/2) {
        		System.out.print(power);
        		return;
        	}
        }
    }
}
