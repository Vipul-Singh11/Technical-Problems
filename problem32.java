package placement;
import java.util.*;
public class problem32 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine().trim();
    	Set<String> set = new HashSet<>();
    	for(int i=0; i<str.length(); i++) {
    		StringBuilder substr = new StringBuilder();
    		for(int j=i; j<str.length(); j++) {
    			substr.append(str.charAt(j));
    			set.add(substr.toString());
    		}
    	}
    	for(String res : set) {
    		System.out.print(res + " ");
    	}
    	System.out.println();
    	System.out.println("Total distinct substrings :" + set.size());
    }
}

