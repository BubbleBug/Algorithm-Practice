package github.bubble.learn.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.bubble.learn.linkedlist.LinkedList;
import github.bubble.learn.linkedlist.ListNode;
import github.bubble.learn.linkedlist.RemoveDuplicatesNodes;

public class DeleteDuplicatesTest {
	private RemoveDuplicatesNodes removeDuplicatesNodes;
	private LinkedList linkList;
	
	@Before
	public void setUp()
	{
		removeDuplicatesNodes=new RemoveDuplicatesNodes();
		linkList = new LinkedList();
	}
	
	@Test
	public void testRemoveNullList() {
		ListNode result= removeDuplicatesNodes.deleteDuplicates1(null);
		assertNull(result);
	}
	
	@Test
	public void testRemoveDuplicatesOfOneNodeList() {
		ListNode head= linkList.CreateIncList(1);
		ListNode result=removeDuplicatesNodes.deleteDuplicates1(head);
		assertSame(head, result);
		assertNull(result.next);
		assertListLength(head,1);
	}
	
	@Test
	public void testRemoveDuplicatesOfTwoNodesList()
	{
		linkList.addNodes(1,1);
		ListNode head=linkList.GetHead() ;
		ListNode result=removeDuplicatesNodes.deleteDuplicates1(head);
		assertSame(head, result);
		assertNull(result.next);
		assertListLength(head,1);
	}
	
	@Test
	public void testRemoveDuplicatesOfTwoDifNodesList()
	{
		linkList.addNodes(1,2);
		ListNode head=linkList.GetHead() ;
		ListNode result=removeDuplicatesNodes.deleteDuplicates1(head);
		assertSame(head, result);
		assertEquals(2,result.next.vale);
		assertListLength(head,2);
	}
	
	@Test
	public void testRemoveDuplicatesOfThirdNodes1List()
	{
		linkList.addNodes(1,1,2);
		ListNode head=linkList.GetHead() ;
		ListNode result=removeDuplicatesNodes.deleteDuplicates1(head);
		assertSame(head, result);
		assertEquals(2,result.next.vale);
		assertNull(result.next.next);
		assertListLength(head,2);
	}
	
	@Test
	public void testRemoveDuplicatesOfThirdNodes2List()
	{
		linkList.addNodes(1,2,2);
		ListNode head=linkList.GetHead() ;
		ListNode result=removeDuplicatesNodes.deleteDuplicates1(head);
		assertSame(head, result);
		assertEquals(2,result.next.vale);
		assertNull(result.next.next);
		assertListLength(head,2);
	}
	
	@Test
	public void testRemoveDuplicatesOfThirdNodes3List()
	{
		linkList.addNodes(1,2,3);
		ListNode head=linkList.GetHead() ;
		ListNode result=removeDuplicatesNodes.deleteDuplicates1(head);
		assertSame(head, result);
		assertEquals(3,linkList.GetTail().vale);
		assertListLength(head,3);
	}
	
	@Test
	public void testRemoveDuplicatesOfThirdNodes4List()
	{
		linkList.addNodes(2,2,2);
		ListNode head=linkList.GetHead() ;
		ListNode result=removeDuplicatesNodes.deleteDuplicates1(head);
		assertSame(head, result);
		assertEquals(2,result.vale);
		assertListLength(head,1);
	}
	
	@Test
	public void testRemoveDuplicatesOfFourthNodes1List()
	{
		linkList.addNodes(1,2,2,3);
		ListNode head=linkList.GetHead() ;
		ListNode result=removeDuplicatesNodes.deleteDuplicates1(head);
		assertSame(head, result);
		assertEquals(3,result.next.next.vale);
		assertListLength(head,3);
	}
	
	@Test
	public void testRemoveDuplicatesOfFourthNodes2List()
	{
		linkList.addNodes(1,1,3,3);
		ListNode head=linkList.GetHead() ;
		ListNode result=removeDuplicatesNodes.deleteDuplicates1(head);
		assertSame(head, result);
		assertEquals(1,head.vale);
		assertEquals(3,linkList.GetTail().vale);
		assertListLength(head,2);
	}
	
	@Test
	public void testRemoveDuplicatesOfOtherList()
	{
		linkList.addNodes(1,1,2,3,3,3);
		ListNode head=linkList.GetHead() ;
		ListNode result=removeDuplicatesNodes.deleteDuplicates1(head);
		assertSame(head, result);
		assertEquals(1,head.vale);
		assertEquals(3,linkList.GetTail().vale);
		assertListLength(head,3);
	}
	
	private void assertListLength(final ListNode head,final int expectedLength)
	{
		int length=0;
		ListNode currentNode=head;
		
		while(currentNode!=null)
		{
			length++;
			currentNode=currentNode.next;
		}
		assertEquals(length,expectedLength);
	}

}
