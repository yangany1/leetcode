package tree;

import java.util.Stack;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;

		if (p != null && q != null && p.val == q.val)
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		return false;
	}

	public boolean isSameTreeStack(TreeNode p, TreeNode q) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(p);
		stack.push(q);
		while (!stack.empty()) {
			p = stack.pop();
			q = stack.pop();
			if (p == null && q == null)
				continue;
			if (p == null || q == null)
				return false;
			if (p.val != q.val)
				return false;
			if (p.left!=null||p.right!=null)
				stack.push(p.left);
			if (q.left!=null||q.right!=null)
				stack.push(q.left);
			if (p.left!=null||p.right!=null)
				stack.push(p.right);
			if (q.left!=null||q.right!=null)
				stack.push(q.right);

		}
		return true;

	}
}
