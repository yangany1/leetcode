package tree;

public class PopulatingNextRightPointersinEachNodeII {
	public void connect(TreeLinkNode root) {
		// �սڵ��ֱ�ӷ���
		if (root == null) {
			return;
		}

		// �ҵ���rootͬһ�е�next node
		TreeLinkNode rootNext = root.next;
		TreeLinkNode next = null; // ��һ�������ӵĶ���

		// rootNext�����null˵���Ѿ���������һ�������node
		// next������null˵���ҵ����ҵ�����ߵ���һ�������ӵĶ���
		while (rootNext != null && next == null) {
			if (rootNext.left != null) { // ���������
				next = rootNext.left;
			} else {
				next = rootNext.right;
			}
			rootNext = rootNext.next;
		}

		if (root.left != null) {
			if (root.right != null) { // �ڲ�����
				root.left.next = root.right;
			} else { // ��������
				root.left.next = next;
			}
		}
		if (root.right != null) { // ��������
			root.right.next = next;
		}

		connect(root.right); // Ҫ�����ұ߶���������
		connect(root.left);
	}
}
