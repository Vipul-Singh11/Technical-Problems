package placement;
import java.util.*;
public class problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
        	arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i : arr) {
        	map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	if(entry.getValue() > 1) {
        		System.out.print(entry.getKey() + " ");
        	}
        }
    }
}
