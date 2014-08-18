package tree;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		TreeNode left = root.left;
		TreeNode right = root.right;

		int diff=Math.abs(getHeight(left)-getHeight(right));
		if(diff>1)
			return false;
		return isBalanced(left)&&isBalanced(right);
	}
	
	public int getHeight(TreeNode root){
		if(root==null)
			return 0;
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}
}
