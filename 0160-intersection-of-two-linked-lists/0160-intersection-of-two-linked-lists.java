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
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        ListNode temp1= h1;
        int size1=0;
        while(temp1!=null){
            temp1 = temp1.next ;
            size1++;
        }
         ListNode temp2= h2 ;
          int size2=0; 
             while(temp2!=null){
            temp2 = temp2.next ;
            size2++;
        }
        temp1=h1;
        temp2=h2;
        if(size1>size2){
            for(int i=1;i<=size1-size2;i++){
                temp1=temp1.next;
            }    
        }
        else{ 
            for(int i=1;i<=size2-size1;i++){
                temp2=temp2.next;
            } 
        }
        while(temp1!=temp2){
           temp1=temp1.next;
            temp2=temp2.next;


        }
return temp1;


        
    }
}