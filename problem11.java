package placement;
import java.util.*;
public class problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter v:");
        int v = sc.nextInt();
        System.out.println("enter w:");
        int w = sc.nextInt();
        int fw = (w-2*v)/2;
        int tw = v-fw;
        System.out.println("No of two wheelers: " + tw);
        System.out.println("No. of four wheelers:" + fw);
    }
}
