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
    public ListNode oddEvenList(ListNode head) {
        //          The odd indices means the first, third, 5th, 7th..in the list.
        //          It is not related to what number it is.
        //           For example:
        // input: 2 4 2 4 2 4 2
        // expected: 2 2 2 2 4 4 4
    
        ListNode t = head;
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t1 = d1; //even 
        ListNode t2 = d2; // odd
        int idx = 1;
        while (t != null) {
            if (idx % 2 == 0) {
                t1.next = t;
                t = t.next;
                t1 = t1.next;
                idx++;
            } else {
                t2.next = t;
                t = t.next;
                t2 = t2.next;
                idx++;
            }
        }
        if (t == null) {
            d1 = d1.next;
            d2 = d2.next;
            t2.next = d1;
            t1.next = null;
        }

        return d2;

    }

}