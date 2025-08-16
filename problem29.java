/*Split Circular Linked List into Two Halves
Given a circular linked list, split it into two equal halves. If the number of nodes is odd, the first list should contain one extra node.
Test Case 1:
Input: 10 ⇄ 20 ⇄ 30 ⇄ 40 ⇄ 50 ⇄ (back to 10)
Output:
List 1: 10 ⇄ 20 ⇄ 30
List 2: 40 ⇄ 50
Test Case 2:
Input: A ⇄ B ⇄ C ⇄ D ⇄ E ⇄ F ⇄ (back to A)
Output:
List 1: A ⇄ B ⇄ C
List 2: D ⇄ E ⇄ F*/

import java.util.*;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}
class DoublyCircularLinkedList {
    Node head;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = newNode.prev = head;
            return;
        }
        Node tail = head.prev;
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    public void printList(Node node) {
        if (node == null) return;
        Node temp = node;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != node);
        System.out.println();
    }

    public void splitList() {
        if(head == null || head.next == head) return;
        Node fast = head;
        Node slow = head;
        while(fast.next != head && fast.next.next != head) {
        	slow = slow.next;
        	fast = fast.next.next;
        }
        if(fast.next != head) {
        	fast = fast.next;
        }
        Node head1 = head;
        Node head2 = slow.next;
        slow.next = head1;
        head1.prev = slow;
        fast.next = head2;
        head2.prev = fast;
        System.out.print("List 1: ");
        printList(head1);
        System.out.print("List 2: ");
        printList(head2);
    }
}

public class problem29 {
    public static void main(String[] args) {
        DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();
        dcll.insert(10);
        dcll.insert(20);
        dcll.insert(30);
        dcll.insert(40);
        dcll.insert(50);
        dcll.printList(dcll.head);
        dcll.splitList();
    }
}


