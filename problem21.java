package placement;
import java.util.Arrays;
import java.util.Scanner;
public class problem21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int k = 1;
		for(int num : arr) {
			if(k == num) {
				k++;
			}else if(k<num) {
				System.out.println(k);
				sc.close();
				return;
			}
		}
		System.out.println(k);
		sc.close();
	}
}
