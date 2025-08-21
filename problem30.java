package placement;
import java.util.*;
public class problem30 {
	public static void printarray(int[] arr, int s, int e) {
		System.out.print("[ ");
		for(int i=s; i<=e; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	int k = sc.nextInt();
    	Map<Integer, List<Integer>> map = new HashMap<>();
    	int sum = 0;
    	map.put(0, new ArrayList<>(Arrays.asList(-1)));
    	for(int i=0; i<n; i++) {
    		sum += arr[i];
    		if(map.containsKey(sum - k)) {
    			for(int idx : map.get(sum - k)) {
    				printarray(arr, idx+1, i);
    			}
    		}
    		map.computeIfAbsent(sum, x -> new ArrayList<>()).add(i);
    	}
    }
}

