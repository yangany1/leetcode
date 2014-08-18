package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}

	public int maxDepth2(TreeNode root) {
		return BFS(root);
	}

	public int BFS(TreeNode root) {
		if (root == null)
			return 0;
		else
			root.val = 1;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while (q.size() != 0) {
			TreeNode curNode = q.poll();
			if (q.size() == 0 && curNode.left == null && curNode.right == null)
				return curNode.val;
			if (curNode.left != null) {
				curNode.left.val = curNode.val + 1;
				q.offer(curNode.left);
			}
			if (curNode.right != null) {
				curNode.right.val = curNode.val + 1;
				q.offer(curNode.right);
			}
		}
		return 0;
	}
	
	
	
	
	public int maxDepthIterative(TreeNode root){
		if(root==null)
			return 0;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		root.val=1;
		stack.push(root);
		int maxDepth=Integer.MIN_VALUE;
		while(!stack.empty()){
			TreeNode t=stack.pop();
			int curDepth=t.val;
			if(t.left==null&&t.right==null&&curDepth>maxDepth){
				maxDepth=curDepth;
			}
			if(t.left!=null){
				t.left.val=curDepth+1;
				stack.push(t.left);
			}
			if(t.right!=null){
				t.right.val=curDepth+1;
				stack.push(t.right);
			}
		}
		return maxDepth;
	}
	
	public static void main(String[] args){
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		t1.left=t2;
		System.out.print(new MaximumDepthofBinaryTree().maxDepthIterative(t1));
		
		
	}
}
