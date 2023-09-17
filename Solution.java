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
        int nodeCounter=0;
        ListNode node=head;
        ListNode midNode=head;
        while(node!=null)
        {
            nodeCounter++;
            //---------------------------------
            if(nodeCounter%2==0)midNode=midNode.next;
            //---------------------------------
            node=node.next;           
        }
        return midNode;
    }
}