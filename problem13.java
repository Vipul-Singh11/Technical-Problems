package placement;
import java.util.*;
public class problem13 {
	public static int Cal(int m, int n) {
		int sum = 0;
		for(int i=m; i<n; i++) {
			if(i%3 == 0 && i%5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m value: ");
        int m = sc.nextInt();
        System.out.println("enter n value: ");
        int n = sc.nextInt();
        System.out.println(Cal(m, n));
    }
}
