package linkedlist;

public class RotateList {
	public ListNode rotateRight(ListNode head, int n) {
		if(head==null)
			return null;
		int length=0;
		ListNode current=head;
		while(current.next!=null){
			current=current.next;
			length++;
		}
		length++;
		current.next=head;
		int left=(length-n%length);
		int i=1;
		ListNode breakNode=head;
		while(i<left){
			breakNode=breakNode.next;
			i++;
		}
		ListNode result=breakNode.next;
		breakNode.next=null;
		return result;
	}
	public void printList(ListNode head){
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
		System.out.println();
	}
	public static void main(String[] args){
		ListNode t1=new ListNode(1);
		ListNode t2=new ListNode(2);
		ListNode t3=new ListNode(3);
		ListNode t4=new ListNode(4);
		ListNode t5=new ListNode(5);
		t1.next=t2;
		t2.next=t3;
		t3.next=t4;
		t4.next=t5;
		t5.next=null;
		new RotateList().printList(t1);
		ListNode t=new RotateList().rotateRight(t1, 2);
		new RotateList().printList(t);
	}
}
