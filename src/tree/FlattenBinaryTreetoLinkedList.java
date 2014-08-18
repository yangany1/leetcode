package tree;

import java.util.Stack;

public class FlattenBinaryTreetoLinkedList {
	public void flatten(TreeNode root) {
		if(root==null)
			return;
		flatten(root.left);
		flatten(root.right);
		if(root.left==null)
			return;
		TreeNode p=root.left;
		while(p.right!=null)
			p=p.right;
		p.right=root.right;
		root.right=root.left;
		root.left=null;
		
	}

	
	public void flattenIterative(TreeNode root) {
		if(root==null)
			return;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		stack.push(root);
		while(!stack.empty()){
			TreeNode t=stack.pop();
			if(t.right!=null)
				stack.push(t.right);
			if(t.left!=null)
				stack.push(t.left);
			t.left=null;
			if(!stack.empty())
				t.right=stack.peek();
		}
		
		
	}

}
