package github.bubble.learn.linkedlist;

public class Basic {

	public static ListNode ReverseLink(ListNode head) {
		if (head==null || head.next==null) {
			return head;
		}
		ListNode curNode=head.next,nextNode,nextNextNode;
		if (curNode==null || curNode.next==null) {
			return head;			
		}
	
		while (curNode.next!=null) {
			nextNode=curNode.next;
			nextNextNode=nextNode.next;
			nextNode.next=head.next;
			head.next=nextNode;
			curNode.next=nextNextNode;
		}
	
		return head;
	}
}
