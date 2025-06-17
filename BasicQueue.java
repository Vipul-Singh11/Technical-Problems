import java.util.*;
class Queue{
	int[] a = new int[5];
	int rear = -1;
	int front = 0;
	public void dequeue() {
		if(rear == -1) {
			System.out.println("Empty");
		}else {
			System.out.println("removed element :" + a[rear]);
			rear--;
		}
	}
	public void enqueue(int data) {
		if(rear == a.length-1) {
			System.out.println("queue is full");
		}else {
			rear++;
			a[rear] = data;
		}
	}
	public void display() {
		if(rear == -1) {
			System.out.println("queue is empty");
		}else {
			for(int i=front; i<=rear; i++) {
				System.out.println(a[i]);
			}
		}
	}
}
public class BasicQueue{
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
		queue.dequeue();
		queue.display();
	}
}
