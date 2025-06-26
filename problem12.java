package placement;
import java.util.*;
public class problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("string =");
        String a = sc.nextLine();
        String[] w = a.trim().split("\\s+");
        int max = 0;
        String res = "-1";
        for(String word : w) {
        	int[] freq = new int[26];
        	int count = 0;
        	for(char c: word.toCharArray()) {
        		if(Character.isLetter(c)) {
        			freq[c - 'a']++;
        		}
        	}
        	for(int i=0; i<freq.length; i++) {
        		if(freq[i] > 1) {
        			count = Math.max(count, freq[i]);
        		}
        	}
        	if(count > max) {
        		max = count;
        		res = word;
        	}
        }
        System.out.println(res);
    }
}
