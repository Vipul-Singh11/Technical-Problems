package placement;
import java.util.*;
public class problem22{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product name: ");
		String a = sc.nextLine().trim();
		Set<Character> set = new LinkedHashSet<>();
		for(int i=0; i<a.length(); i++) {
			set.add(a.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for(char c : set) {
			sb.append(c);
		}
		System.out.println(sb.toString());
	}
}