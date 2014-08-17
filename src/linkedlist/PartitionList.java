package linkedlist;

public class PartitionList {
	public ListNode partition(ListNode head, int x) {
		ListNode smallHead=new ListNode(0);
		ListNode bigHead=new ListNode(0);
		ListNode smallCur=smallHead;
		ListNode bigCur=bigHead;
		ListNode current=head;
		while(current!=null){
			if(current.val<x){
				smallCur.next=current;
				smallCur=smallCur.next;
			}else{
				bigCur.next=current;
				bigCur=bigCur.next;
			}
			current=current.next;
		}
		smallCur.next=bigHead.next;
		bigCur.next=null;
		return smallHead.next;
	}
}
