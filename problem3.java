import java.util.*;
public class problem3{
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void insertAtBegin(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void count() {
    	if(head == null) {
    		System.out.println("no. of node is 0");
    	}
    	Node temp = head;
    	int count =0;
    	while(temp!=null) {
    		temp = temp.next;
    		count++;
    	}
    	System.out.println("Total patients in queue are: " + count);
    }
    public static void main(String[] args) {
        problem3 list = new problem3();
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();
            list.insertAtBegin(name);
            System.out.print("Do you want to enter another name? (yes/no): ");
            choice = sc.nextLine();
        } while (choice.equals("yes"));
        list.count();
    }
}
