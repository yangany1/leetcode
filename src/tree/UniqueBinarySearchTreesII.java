package tree;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII {
	public List<TreeNode> generateTrees(int n) {
		if(n==0)
			return generateTrees(1,0);
		else
			return generateTrees(1,n);

	}
	
	private List<TreeNode> generateTrees(int start,int end){
		List<TreeNode> list=new ArrayList<TreeNode>();
		if(start>end){
			list.add(null);
			return list;
		}
		
		
		for(int k=start;k<=end;k++){
			List<TreeNode> leftSub=generateTrees(start,k-1);
			List<TreeNode> rightSub=generateTrees(k+1,end);
			for(TreeNode a:leftSub){
				for(TreeNode b:rightSub){
					TreeNode root=new TreeNode(k);
					root.left=a;
					root.right=b;
					list.add(root);
				}
			}
		}
		return list;
	}
}
