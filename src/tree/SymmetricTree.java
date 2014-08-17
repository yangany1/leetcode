package tree;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if(root==null)
			return true;
		TreeNode left=root.left;
		TreeNode right=root.right;
		return check(left,right);
	}
	public boolean check(TreeNode left,TreeNode right){
		if(left==null&&right==null)
			return true;
		if(left==null||right==null)
			return false;
		return left.val==right.val&&check(left.left,right.right)&&check(left.right,right.left);
	}
	
	
}
