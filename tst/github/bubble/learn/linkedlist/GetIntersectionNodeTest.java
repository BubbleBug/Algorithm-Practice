package github.bubble.learn.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetIntersectionNodeTest {
    GetIntersectionNode getIntersectionNode;
    @Before
    public void setUp() throws Exception {
        getIntersectionNode=new GetIntersectionNode();
    }

    @Test
    public void testGetIntersectionNodeOfNullList() throws Exception {
        ListNode node= getIntersectionNode.getIntersectionNode2(null, null);
        assertNull(node);
    }

    @Test
    public void testGetIntersectionNodeOfOneNullList() throws Exception {
        ListNode node= getIntersectionNode.getIntersectionNode(new ListNode(1), null);
        assertNull(node);
    }

    @Test
    public void testGetIntersectionNodeNotHaveIntersectionNode() throws Exception {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode result= getIntersectionNode.getIntersectionNode(l1, l2);
        ListNode result2= getIntersectionNode.getIntersectionNode2(l1, l2);
        assertNull(result);
        assertNull(result2);
    }

    @Test
         public void testGetIntersectionNode1() throws Exception {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        l2.next=l3;
        l1.next=l3;
        ListNode result= getIntersectionNode.getIntersectionNode(l1, l2);
        ListNode result2= getIntersectionNode.getIntersectionNode2(l1, l2);
        assertNotNull(result);
        assertEquals(3,result.vale);
        assertNotNull(result2);
        assertEquals(3,result2.vale);

    }

    @Test
    public void testGetIntersectionNode2() throws Exception {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        l2.next=new ListNode(3);
        ListNode l3=new ListNode(4);
        l3.next=new ListNode(5);
        l2.next.next=l3;
        l1.next=l3;
        ListNode result= getIntersectionNode.getIntersectionNode(l1, l2);
        assertNotNull(result);
        assertEquals(4,result.vale);
        ListNode result2= getIntersectionNode.getIntersectionNode2(l1, l2);
        assertNotNull(result2);
        assertEquals(4,result2.vale);

    }


}