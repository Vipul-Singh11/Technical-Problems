package placement;
import java.util.*;

public class SinglyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at beginning
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void insertatindex(int data, int position) {
    	Node newNode = new Node(data);
    	if(position == 0) {
    		head = newNode;
    		return;
    	}
    	Node temp = head;
    	for(int i=0; i<position-1; i++) {
    		temp = temp.next;
    		if(temp == null) {
    			System.out.println("position is out of bounds");
    			return;
    		}
    	}
    	Node tem = temp.next;
    	temp.next = newNode;
    	newNode.next = tem;
    }
    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtEnd(40);
        list.display();
        list.insertatindex(102, 2);
        list.display();
    }
}