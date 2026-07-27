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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
     //   ListNode front=null;
        ListNode previous=null;
        while(temp!=null){
            ListNode kthnode=knode(temp,k);
            if(kthnode==null){
                if(previous!=null){
                    previous.next=temp;
                }
                break;
            }
            ListNode front=kthnode.next;
            kthnode.next=null;
            ListNode newhead=reverse(temp);
            
          if(temp==head){
            head=newhead;
          }
          else{
            previous.next=newhead;
          }
           previous=temp;
           temp=front;
        }
        return head;
        
    }
    public static ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public static ListNode knode(ListNode temp ,int k){
        k=k-1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
}