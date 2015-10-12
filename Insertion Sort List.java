//Sort a linked list using insertion sort.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode root=new ListNode(0);
        root.next=head;
        ListNode sorted;
        ListNode cur=head;
        ListNode post;
        while(cur!=null && cur.next!=null)
        {
            if(cur.val<=cur.next.val)
                cur=cur.next;
            else
            {
                post=cur.next;
                cur.next=post.next;
                
                sorted=root;
                while(sorted.next.val<=post.val)
                {
                    sorted=sorted.next;
                }
                post.next=sorted.next;
                sorted.next=post;
            }
        }
        
        return root.next;
    }
}