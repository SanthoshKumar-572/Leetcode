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
    public ListNode middleNode(ListNode head) {
       /* ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int middle=((count/2)+1);
        temp=head;
        while(temp!=null){
            middle=middle-1;
            if(middle==0){
                break;
            }
            temp=temp.next;
        }
        return temp;*/
        ListNode slow=head;
        ListNode high=head;
        while(high!=null && high.next!=null){
            slow=slow.next;
            high=high.next.next;
        }
        return slow;
    }
}