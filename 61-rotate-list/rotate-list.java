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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        int count=1;
        ListNode tail=head;
        while(tail.next!=null){
            count++;
            tail=tail.next;
        }
        tail.next=head;
        k=k%count;
        ListNode nenode=findn(tail,count-k);
        head=nenode.next;
        nenode.next=null;
        return head;
    }
    public static ListNode findn(ListNode tail,int k){
    
        for(int i=0;i<k;i++){
            tail=tail.next;
        }
        return tail;
        
    }

}