package github.bubble.learn.linkedlist;

public class Remove {

	public ListNode removeNthNodeLostList(ListNode head, int n) {
		ListNode faster = head, slower = head;
		if (head == null || head.next == null)
			return null;
		while (n > 0 && faster != null) {
			faster = faster.next;
			n--;
		}
		if (faster == null)
			return head.next;

		while (faster.next != null) {
			faster = faster.next;
			slower = slower.next;
		}
		slower.next = slower.next.next;
		return head;
	}

	public ListNode removeMiddleNode(ListNode head) {
		if (head == null || head.next == null)
			return null;
		ListNode fistNode = head, secondNode = head, curNode = head;
		boolean isMove = false;

		while (fistNode != null) {
			fistNode = fistNode.next;
			if (isMove) {
				curNode = secondNode;
				secondNode = secondNode.next;
				isMove = false;
			} else
				isMove = true;
		}

		curNode.next = curNode.next.next;
		return head;
	}
}
