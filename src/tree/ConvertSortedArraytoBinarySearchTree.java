package tree;

public class ConvertSortedArraytoBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] num) {
		return makeNode(num, 0, num.length - 1);
	}

	public TreeNode makeNode(int[] num, int start, int end) {
		if (start <= end) {
			int middle = (start + end) / 2;
			TreeNode middleNode = new TreeNode(num[middle]);
			middleNode.left = makeNode(num, start, middle - 1);
			middleNode.right = makeNode(num, middle + 1, end);
			return middleNode;
		}
		return null;
	}
}
