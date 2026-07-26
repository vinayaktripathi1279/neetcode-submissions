/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
    
        ListNode temp=head;
        int sz=0;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(sz==n){
            return head.next;
        }
        int find=sz-n;// to find its previus node
        int i=0;
    //    
        ListNode prev=head;
        while(i<find-1){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}


