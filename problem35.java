package placement;
import java.util.*;
public class problem35 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s1 = sc.next();
    	String s2 = sc.next();
    	if(s1.length() == s2.length() && (s2 + s2).contains(s1)) {
    		System.out.println("true");
    	}else {
    		System.out.println("false");
    	}
    	sc.close();
    }
}