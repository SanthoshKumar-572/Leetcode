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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
     ListNode temp=head;
        
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int middle=((count/2)+1);
        
        temp=head;
        ListNode prev=null;
        while(temp!=null){
            middle=middle-1;
            if(middle==1){
                prev=temp;
            }
            temp=temp.next;
        }
        prev.next=prev.next.next;
        return head;
        


    }
   /* public static ListNode Findvalue(ListNode){
        ListNode temp=head;
        
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int middle=((count/2)+1);
        
        temp=head;
        ListNode prev=null;
        while(temp!=null){
            middle=middle-1;
            if(middle==1){
                prev=temp;
            }
            temp=temp.next;
        }
        prev.next=prev.next.next;
        return temp;
        

    }*/
}