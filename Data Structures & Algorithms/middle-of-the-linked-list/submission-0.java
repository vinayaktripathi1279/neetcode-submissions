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
    public ListNode middleNode(ListNode head) {
        // // edge case
        // ListNode temp=head;
        // int count=0;
        // while(temp!=null){
        //     temp=temp.next;
        //     count++;
        // }
        // int num=count/2;

        // //
        // ListNode pointer =new ListNode(num);

        // can use slow and fast
        // if()
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // // mid is slow
        // ListNode temp=slow;
        // while(temp!=null){
        //     temp=temp.next;
        // }
        return slow;
    }
}
  