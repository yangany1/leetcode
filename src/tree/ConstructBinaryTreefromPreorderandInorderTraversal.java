package tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		Map<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
		for(int i=0;i<inorder.length;i++)
			hashMap.put(inorder[i], i);
		return buildTreeRecurvise(preorder,0,preorder.length-1,inorder,0,inorder.length-1,hashMap);
		
	}
	
	private TreeNode buildTreeRecurvise(int[] preorder,int startP,int endP,int[] inorder,int startI,int endI,Map<Integer,Integer> hashMap){
		if(startP>endP)
			return null;
	
		TreeNode root=new TreeNode(preorder[startP]);
		if(startP==endP)
			return root;
		int i=hashMap.get(preorder[startP]);
		int leftNum=i-startI;
		root.left=buildTreeRecurvise(preorder,startP+1,startP+leftNum,inorder,startI,i-1,hashMap);
		root.right=buildTreeRecurvise(preorder,startP+leftNum+1,endP,inorder,i+1,endI,hashMap);
		return root;
	}
}
