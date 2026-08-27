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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;

        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
            ListNode newhead=reverseList(slow.next);
            ListNode first=head;
            ListNode second=newhead;
            while(second!=null){
                if(first.val!=second.val){
                    reverseList(newhead);
                    return false;
                }
                first=first.next;
                second=second.next;
            }
            reverseList(newhead);
            return true;
    }
}


//             }    

      
//         return true;

//     }
// }
    
    

//         // brute force approacg
//         ListNode temp=head;
//         ListNode dummy=new ListNode(0);
//         ListNode temp1=dummy;

//         while(temp!=null){
//             temp1.next=temp;
//              temp=temp.next;
//         }
//         // temp1 ke ander purama stoe hp gay and now
//         // dummy .next se retuen lar sakte hai
//         ListNode prev=null;

//         while(temp!=null){
//             ListNode front=temp.next;
//             temp.next=prev;  // ,aon reverwsing
//             prev=temp;
//             temp=front;
//         }
//         while(temp!=null && temp1!=null){
//             if (temp.val != temp1.val) {
//                 return false;
//             }
//             temp=temp.next;
//             temp1=temp1.next;
//         }
//         return true;

//     }
// }




//         ListNode slow =head;
//         ListNode fast=head;
//         while(slow.val<fast.val){
//             slow=slow.next;
//             fast=fast.next;
//             if(slow.val==fast.val){
//                 return true;
//             }
//         }
//         return false;
    
//     }
// }
          