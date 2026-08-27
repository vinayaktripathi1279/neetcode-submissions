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
    public ListNode reverseList(ListNode head) {

        ListNode temp=head;
        ListNode prev=null;
        // ListNode front =new ListNode();

        while(temp!=null){
            ListNode front =temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public ListNode removeElements(ListNode head, int val) {

        //solve it through stack
        Stack<Integer> st=new Stack<>();

        ListNode temp=head;
        while(temp!=null){
            if(temp.val!=val){
                st.push(temp.val);
            }
            temp=temp.next;
        }
        // temp=head;
        // if(temp!=null && temp.val==val){
        //     st.pop();
        //     temp=temp.next;
        // }

        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        while(!st.isEmpty()){
            int value=st.pop();
            ListNode newNode=new ListNode(value);
            curr.next=newNode;
            curr=curr.next;
        }
        return reverseList(dummy.next);
    }
}
            
        // ListNode prev=null;
        // while(temp!=null){
        //     temp=temp.next;
        //     if(temp.val==val){
        //         ListNode front=temp.next;
        //         prev=front;
        //     }
        //     temp=temp.next;
        // }
        // return head;
//     }
// }
        