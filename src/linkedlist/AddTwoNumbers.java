package linkedlist;

import java.util.Stack;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode head = new ListNode(0);
		ListNode current = head;
		int carry = 0;
		while (l1 != null && l2 != null) {
			int sum = l1.val + l2.val;
			if (carry == 1) {
				sum += 1;
				carry = 0;
			}
			if (sum >= 10) {
				carry = 1;
				sum -= 10;
			}
			ListNode t = new ListNode(sum);
			current.next = t;
			current = current.next;
			l1=l1.next;
			l2=l2.next;
		}
		while (l1 != null) {
			int sum = l1.val;
			if (carry == 1) {
				sum += 1;
				carry = 0;
			}
			if (sum >= 10) {
				carry = 1;
				sum -= 10;
			}
			ListNode t = new ListNode(sum);
			current.next = t;
			current = current.next;
			l1=l1.next;
		}

		while (l2 != null) {
			int sum = l2.val;
			if (carry == 1) {
				sum += 1;
				carry = 0;
			}
			if (sum >= 10) {
				carry = 1;
				sum -= 10;
			}
			ListNode t = new ListNode(sum);
			current.next = t;
			current = current.next;
			l2=l2.next;
		}
		if (carry == 1) {
			ListNode t = new ListNode(1);
			current.next = t;
			current = current.next;
		}
		return head.next;
	}
}
