package tree;

public class PopulatingNextRightPointersinEachNode {
	
	public void connect(TreeLinkNode root) {

		if(root==null)
			return;
		if(root.left!=null){
				root.left.next=root.right;
		}
		if(root.right!=null){
			root.right.next=(root.next!=null?root.next.left:null);
		}
		connect(root.left);
		connect(root.right);
	}
}

