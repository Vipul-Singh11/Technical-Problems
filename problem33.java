package placement;
import java.util.*;
public class problem33 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	Set<Integer> set = new HashSet<>();
    	for(int num : arr) {
    		set.add(num);
    	}
    	int longest = 0;
    	for(int num : set) {
    		if(!set.contains(num-1)) {
    			int curr = num;
    			int count = 1;
    			while(set.contains(curr + 1)) {
        			curr++;
        			count++;
        		}
    			longest = Math.max(longest, count);
    		}
    	}
    	System.out.println("Longest sequence :" + longest);
    }
}

