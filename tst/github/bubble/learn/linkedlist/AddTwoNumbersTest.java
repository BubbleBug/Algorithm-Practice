package github.bubble.learn.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.bubble.learn.linkedlist.AddTwoNumbers;
import github.bubble.learn.linkedlist.LinkedList;
import github.bubble.learn.linkedlist.ListNode;

public class AddTwoNumbersTest {
	private AddTwoNumbers addTwoNumbers;

	@Before
	public void setUp() {

		addTwoNumbers = new AddTwoNumbers();
	}

	@Test
	public void testAddTwoNullLinkedList() {
		ListNode result = addTwoNumbers.addTwoNumbers(null, null);
		assertNull(result);
		assertListLength(result,0);
	}

	@Test
	public void testAddOneNullListAndSingleNodeList() {
		LinkedList List = new LinkedList();
		List.addNodes(1);
		ListNode h1 = List.GetHead();
		ListNode result = addTwoNumbers.addTwoNumbers(h1, null);
		assertNull(result.next);
		assertEquals(1, result.vale);
		assertListLength(result,1);
	}

	@Test
	public void testAddTwoSingleNodeListGetTwoNodesList() {
		LinkedList List1 = new LinkedList();
		List1.addNodes(1);
		LinkedList List2 = new LinkedList();
		List2.addNode(9);
		ListNode h1 = List1.GetHead();
		ListNode h2 = List2.GetHead();
		ListNode result = addTwoNumbers.addTwoNumbers(h1, h2);
		assertEquals(0, result.vale);
		assertEquals(1, result.next.vale);
		assertNull(result.next.next);
		assertListLength(result,2);
	}

	@Test
	public void testAddTwoNodesAndSingleNodeListGetTwoNodesList() {
		LinkedList List1 = new LinkedList();
		List1.addNodes(1);
		LinkedList List2 = new LinkedList();
		List2.addNodes(2, 3);
		ListNode h1 = List1.GetHead();
		ListNode h2 = List2.GetHead();
		ListNode result = addTwoNumbers.addTwoNumbers(h1, h2);
		assertEquals(3, result.vale);
		assertEquals(3, result.next.vale);
		assertNull(result.next.next);
		assertListLength(result,2);
	}

	@Test
	public void testAddTwoNodesAndSingleNodeList() {
		LinkedList List1 = new LinkedList();
		List1.addNodes(5);
		LinkedList List2 = new LinkedList();
		List2.addNodes(7, 3);
		ListNode h1 = List1.GetHead();
		ListNode h2 = List2.GetHead();
		ListNode result = addTwoNumbers.addTwoNumbers(h1, h2);
		assertEquals(2, result.vale);
		assertEquals(4, result.next.vale);
		assertNull(result.next.next);
		assertListLength(result,2);
	}

	@Test
	public void testAddMoreNodesNodeList() {
		LinkedList List1 = new LinkedList();
		List1.addNodes(8, 7, 2, 0);
		LinkedList List2 = new LinkedList();
		List2.addNodes(5, 3);
		ListNode h1 = List1.GetHead();
		ListNode h2 = List2.GetHead();
		ListNode result = addTwoNumbers.addTwoNumbers(h1, h2);
		assertEquals(3, result.vale);
		assertListLength(result,4);
	}
	

	private void assertListLength(final ListNode head, final int expectedLength) {
		int length = 0;
		ListNode currentNode = head;

		while (currentNode != null) {
			length++;
			currentNode = currentNode.next;
		}
		assertEquals(length, expectedLength);
	}
}
