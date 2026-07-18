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
    public int getDecimalValue(ListNode head) {
        ListNode tail =head;
      //  int data=0;
       // ListNode temp=head;
        int ans=0;
        while(tail!=null){
           ans=(ans*2)+tail.val;
            tail=tail.next;
        }
        return ans;
    }
}