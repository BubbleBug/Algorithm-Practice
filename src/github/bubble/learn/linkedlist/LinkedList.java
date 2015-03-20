package github.bubble.learn.linkedlist;

public class LinkedList {
	private ListNode head = null;
	private ListNode prev = null;
	private ListNode tail = null;

	public ListNode CreateIncList(int count) {
		if (count == 0) {
			head = null;
			prev = null;
			tail = null;
		}
		for (int i = 1; i < count + 1; i++) {
			ListNode curr = new ListNode(i);
			if (head == null) {
				head = curr;
				tail = head;
				prev = null;
			} else {
				tail.next = curr;
				prev = tail;
				tail = curr;
			}
		}
		return head;

	}

	public void addNode(int value) {
		ListNode node = new ListNode(value);
		if (head == null) {
			head = node;
			prev = null;
			tail = head;
		} else {
			tail.next = node;
			prev = tail;
			tail = node;
		}
	}

	public void addNodes(int... values) {
		for (int value : values) {
			addNode(value);
		}
	}

	public ListNode GetHead() {
		return head;
	}

	public ListNode GetTail() {
		return tail;
	}

	public ListNode GetPrev() {
		return prev;
	}

}
