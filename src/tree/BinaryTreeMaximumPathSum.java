package tree;

public class BinaryTreeMaximumPathSum {
	int max;
	public int maxPathSum(TreeNode root) {
		max=Integer.MIN_VALUE;
		if(root==null)
			return 0;
		findMax(root);
		return max;
	}
	
	
	public int findMax(TreeNode node){
		if(node==null)
			return 0;
		int left=Math.max(findMax(node.left), 0);
		int right=Math.max(findMax(node.right), 0);
		
		max=Math.max(node.val+left+right, max);
		return node.val+Math.max(left, right);
		
	}
}
