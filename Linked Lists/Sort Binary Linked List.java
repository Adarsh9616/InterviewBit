/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) 
    {
        int count1=0;
        int count0=0;
        ListNode temp=A;
        while(temp!=null)
        {
            if(temp.val==1)
            {
                count1++;
            }
            else
            {
                count0++;
            }
            temp=temp.next;
        }
        temp=A;
        while(temp!=null)
        {
            if(count0>0)
            {
                count0--;
                temp.val=0;
            }
            else
            {
                count1--;
                temp.val=1;
            }
            temp=temp.next;
        }
        return A;
    }
}
