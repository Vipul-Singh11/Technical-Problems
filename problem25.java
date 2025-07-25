package placement;
import java.util.*;
public class problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 0) {
            System.out.println(-1);
            return;
        }
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;
        if (n == 1) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                System.out.println(jump);
                return;
            }
            maxReach = Math.max(maxReach, i + arr[i]);
            step--;
            if (step == 0) {
                jump++;
                if (i >= maxReach) {
                    System.out.println(-1);
                    return;
                }
                step = maxReach - i;
            }
        }
    }
}
