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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        while(left<right){
         ListNode  t1= head  ;
         ListNode  t2  = head ;
         for(int i=1;i<left;i++){
            t1 = t1.next ;
         }
          for(int i=1;i<right;i++){
            t2 = t2.next ;
         }
         int swap = t1.val ;
          t1.val = t2.val ;
          t2.val = swap ;

          left ++;
          right --;
         
        }
    return head ;
    }
}