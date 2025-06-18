import java.util.*;
class Tree{
	int value;
	Tree left;
	Tree right;
	Tree(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
}
public class Binarytree{
	Tree root;
	public void inorder(Tree node) {
		if(node == null) {
			return;
		}
			inorder(node.left);
			System.out.print(node.value + " ");
			inorder(node.right);
	}
	public void preorder(Tree node) {
		if(node==null) {
			return;
		}
			System.out.print(node.value + " ");
			preorder(node.left);
			preorder(node.right);
	}
	public void postorder(Tree node) {
		if(node==null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.value + " ");
	}
	
	public static void main(String[] args) {
		Binarytree tree = new Binarytree();
		tree.root = new Tree(1);
		tree.root.left = new Tree(2);
		tree.root.right = new Tree(3);
		tree.root.left.left = new Tree(4);
		tree.root.left.right = new Tree(5);
		tree.root.right.left = new Tree(6);
		tree.root.right.right = new Tree(7);
		System.out.print("Inorder: ");
		tree.inorder(tree.root);
		System.out.println();
		System.out.print("Preorder: ");
		tree.preorder(tree.root);
		System.out.println();
		System.out.print("postorder: ");
		tree.postorder(tree.root);
	}
}
