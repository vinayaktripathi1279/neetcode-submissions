/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int count1=0;
        int count2=0;

        while(temp1!=null){
            temp1=temp1.next;
            count1++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            count2++;
        }
        ListNode p1=headA;
        ListNode p2=headB;

        int diff=Math.abs(count1-count2);
        if(count1>count2){
            for(int i=0;i<diff;i++){
                p1=p1.next;
            }
        }

        else{
            for(int i=0;i<diff;i++){

            p2=p2.next;
            }
        }
            while(p1!=p2){
                p1=p1.next;
                p2=p2.next;
            }
            return p1;
    }
}
