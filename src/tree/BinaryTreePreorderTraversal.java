package tree;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		preorder(root, list);
		return list;
	}

	public void preorder(TreeNode root, ArrayList<Integer> list) {
		if (root != null) {
			list.add(root.val);
			preorder(root.left, list);
			preorder(root.right, list);
		}

		return;
	}

	public ArrayList<Integer> preorderTraversalIterator(TreeNode root) {
		Stack<TreeNode> stack=new Stack<TreeNode>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(root==null){
			return list;
		}
		while(!stack.empty()||root!=null){
			while(root!=null){
				list.add(root.val);
				stack.push(root);
				root=root.left;
			}
			root=stack.pop();
			root=root.right;
		}
		return list;
	}

	public static void main(String[] args) {
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		one.right = two;
		two.left = three;
		ArrayList<Integer> list = new BinaryTreePreorderTraversal()
				.preorderTraversalIterator(one);
		System.out.print(list);
	}
}
