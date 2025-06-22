package placement;
import java.util.*;
public class problem9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String a = sc.nextLine();
		int[] b = new int[256];
		for(int i = 0; i<a.length(); i++) {
			b[a.charAt(i)]++;
		}
		for(int i=0; i<a.length(); i++) {
			if(b[a.charAt(i)] == 1) {
				System.out.print(a.charAt(i) + " ");
			}
		}
	}
}