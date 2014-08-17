package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

	//二叉树后续遍历，递归方法
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		postorder(root, list);
		return list;
	}

	public void postorder(TreeNode root, ArrayList<Integer> list) {
		if (root != null) {
			postorder(root.left, list);
			postorder(root.right, list);
			list.add(root.val);
		}

		return;
	}

	//二叉树后续遍历，迭代方法
	public ArrayList<Integer> postorderTraversalIterator(TreeNode root) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(root==null)
			return list;
		TreeNode pre=null;
		TreeNode current=null;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		stack.push(root);
		while(!stack.empty()){
			current=stack.peek();
			if((current.left==null&&current.right==null)||(pre!=null&&(current.left==pre||current.right==pre))){
				list.add(current.val);
				stack.pop();
				pre=current;
			}
			else{
				if(current.right!=null)
					stack.push(current.right);
				if(current.left!=null)
					stack.push(current.left);
			}
			
		}
		return list;
	}

	public static void main(String[] args) {
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		one.right = two;
		two.left = three;
		ArrayList<Integer> list = new BinaryTreePostorderTraversal()
				.postorderTraversalIterator(one);
		System.out.print(list);
	}
}
