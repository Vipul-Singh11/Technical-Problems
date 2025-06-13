import java.util.*;

public class DoublyLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head = null;
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }
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
        newNode.prev = temp;
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
    	newNode.prev = temp;
    	newNode.next = tem;
    }

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
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtEnd(40);
        list.display();
        list.insertatindex(102, 2);
        list.display();
    }
}
