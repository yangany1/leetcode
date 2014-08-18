package tree;

public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		return isBetweenValue(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	private boolean isBetweenValue(TreeNode root,int min,int max){
		if(root==null)
			return true;
		return root.val<max&&root.val>min&&isBetweenValue(root.left,min,root.val)&&isBetweenValue(root.right,root.val,max);
	}
}
