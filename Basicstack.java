import java.util.*;
class Stack{
	int[] a = new int[5];
	int top = -1;
	public void push(int data) {
		if(top == a.length-1) {
			System.out.println("overflow");
		}else {
			top++;
			a[top] = data;
			System.out.println("pushed element: " + a[top]);
		}
	}
	public void pop() {
		if(top == -1) {
			System.out.println("underflow");
		}else {
			System.out.println("popped element: " + a[top]);
			top--;
		}
	}
	public void peek() {
		if(top == -1) {
			System.out.println("empty");
		}else {
			System.out.println(a[top]);
		}
	}
	public void display() {
		if(top == -1) {
			System.out.println("empty");
		}else {
			for(int i = top; i>=0; i--) {
				System.out.println(a[i]);
			}
		}
	}
}
public class Basicstack{
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.pop();
		stack.peek();
		stack.display();
	}
}
