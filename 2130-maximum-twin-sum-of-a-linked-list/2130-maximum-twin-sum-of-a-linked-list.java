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
    public int pairSum(ListNode head) {
        
        int max =0;
        ListNode slow=head ;
        ListNode fast = head ;
        while(fast.next !=null && fast.next.next!=null){
                slow= slow.next ;
                fast   = fast.next.next;
        }
        ListNode head2 = slow.next ;
         ListNode pre = null;
         ListNode far= null;
         ListNode curr = head2 ;
         while(curr!=null){
            far = curr.next ;
            curr.next =pre;
            pre= curr;
            curr= far;
         }
         head2 = pre;
         ListNode i = head ;
         ListNode j = head2;
         while(j!=null){
            if(i.val+j.val>max){
                max =i.val+j.val;
                i = i.next  ;
                j = j.next ;
            }else{
                   i = i.next  ;
                j = j.next ;
            }
         }
         return max ;




    }
}