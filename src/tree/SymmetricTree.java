package tree;

import java.util.Stack;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		TreeNode left = root.left;
		TreeNode right = root.right;
		return check(left, right);
	}

	public boolean check(TreeNode left, TreeNode right) {
		if (left == null && right == null)
			return true;
		if (left == null || right == null)
			return false;
		return left.val == right.val && check(left.left, right.right)
				&& check(left.right, right.left);
	}

	public boolean isSymmetricIterative(TreeNode root) {
		if (root == null)
			return true;
		Stack<TreeNode> stack = new Stack<TreeNode>();

		stack.push(root.right);
		stack.push(root.left);

		while (!stack.empty()) {
			TreeNode p = stack.pop();
			TreeNode q = stack.pop();
			if (p == null && q == null)
				continue;
			if (p == null || q == null)
				return false;
			if (p.val != q.val)
				return false;
			if (!(p.left == null && p.right == null && q.left == null
					&& q.right == null) ){
				stack.push(p.left);
				stack.push(q.right);
				stack.push(p.right);
				stack.push(q.left);
			}
		}
		return true;
	}

}
