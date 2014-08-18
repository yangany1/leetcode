package tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromInorderandPostorderTraversal {

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		Map<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
		for(int i=0;i<inorder.length;i++)
			hashMap.put(inorder[i], i);
		return buildTreeRecurvise(inorder,0,inorder.length-1,postorder,0,postorder.length-1,hashMap);
		
	}
	
	private TreeNode buildTreeRecurvise(int[] inorder,int startI,int endI,int[] postorder,int startP,int endP,Map<Integer,Integer> hashMap){
		if(startI>endI)
			return null;
	
		TreeNode root=new TreeNode(postorder[endP]);
		if(startP==endP)
			return root;
		int i=hashMap.get(postorder[endP]);
		int leftNum=i-startI;
		root.left=buildTreeRecurvise(inorder,startI,i-1,postorder,startP,startP+leftNum-1,hashMap);
		root.right=buildTreeRecurvise(inorder,i+1,endI,postorder,startP+leftNum,endP-1,hashMap);
		return root;
	}
}
