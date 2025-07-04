package placement;
import java.util.*;
public class problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter word: ");
        String a = sc.nextLine();
        int[] freq = new int[52];
        Set<Character> set = new LinkedHashSet<>();
        for(char c : a.toCharArray()) {
        	if(Character.isUpperCase(c)) {
        		freq[c - 'A']++;
        		set.add(c);
        	}else {
        		freq[c - 'a' + 26]++;
        		set.add(c);
        	}
        }
        for(char c : set) {
        	if(Character.isUpperCase(c)) {
        		System.out.println(c + " : " + freq[c - 'A']);
        	}else {
        		System.out.println(c + " : " + freq[c - 'a' + 26]);
        	}
        }
    }
}
