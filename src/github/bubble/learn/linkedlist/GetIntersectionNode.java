package github.bubble.learn.linkedlist;

/**
 * Created by wangshuang on 2015/4/20.
 *
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * Notes:
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class GetIntersectionNode {
    /**
     * This function from:
     * https://leetcode.com/discuss/31067/share-my-simple-java-solution-o-n-time-o-1-space
     */
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if(headA ==null || headB==null)return null;
        ListNode curA=headA,curB=headB;
        while (curA!=curB){
            curA=curA==null?headB:curA.next;
            curB=curB==null?headA:curB.next;
        }
        return curA;
    }

    public ListNode getIntersectionNode2(ListNode headA,ListNode headB){
        if(headA ==null || headB==null)return null;
        ListNode curA=headA,curB=headB;
        int sizeA=0,sizeB=0;
        while (curA!=null){
            curA=curA.next;
            sizeA++;
        }
        while (curB!=null){
            curB=curB.next;
            sizeB++;
        }

        if(sizeA > sizeB){
            for(int i = 0; i < sizeA - sizeB; i++){
                headA = headA.next;
            }
        }else{
            for(int j = 0; j < sizeB - sizeA; j++){
                headB = headB.next;
            }
        }

        while (headA!=null && headB!=null){
            if(headA==headB){
                return  headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return  null;
    }
}
