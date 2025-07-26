package placement;
import java.util.*;
class Node{
	int val;
	Node next;
	public Node(int val) {
		this.val = val;
	}
}
public class problem26 {
	public static Boolean check(Node head) {
		Node temp = head;
		Set<Node> set = new HashSet<>();
		while(temp != null) {
			if(temp.next!=null && set.contains(temp.next)) {
				temp.next = null;
				return true;
			}else {
				set.add(temp);
				temp = temp.next;
			}
		}
		return false;
	}
	public static void printList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.print("null");
	}
    public static void main(String[] args) {
    	Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
        if(check(head)) {
        	System.out.println("Loop detected and removed.\n"
        			+ "Final Linked List: ");
        }
        printList(head);
    }
}
