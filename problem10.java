package placement;
import java.util.*;
public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        String a = Integer.toString(n);
        String b = a.replace('0', '1');
        n = Integer.parseInt(b);
        System.out.println(n);
    }
}
