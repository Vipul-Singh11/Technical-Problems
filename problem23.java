package placement;
import java.util.*;
public class problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n <= 1) {
            System.out.println(0);
            return;
        }
        if (arr[0] == 0) {
            System.out.println("Not reachable");
            return;
        }
        int jumps = 1;
        int k = arr[0];
        int curr = arr[0];
        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                System.out.println(jumps);
                return;
            }
            k = Math.max(k, i + arr[i]);
            if (i == curr) {
                jumps++;
                curr = k;
                if (curr >= n - 1) {
                    System.out.println(jumps);
                    return;
                }
            }
        }
        System.out.println("Not reachable");
    }
}
