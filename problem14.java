package placement;
import java.util.*;
public class problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter word: ");
        String a = sc.nextLine();
        System.out.println("enter second string:");
        String b = sc.nextLine();
        List<Character> list = new ArrayList<>();
        for(char c : a.toCharArray()) {
        	list.add(c);
        }
        for(char c : b.toCharArray()) {
        	if(list.contains(c)) {
        		list.remove(c);
        	}
        }
        System.out.println(list.toString());
    }
}
