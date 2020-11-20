/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution 
{
    public ListNode deleteDuplicates(ListNode A) 
    {
        ListNode prev = A, p1 = A.next;
        while(p1!=null){
            if(p1.val != prev.val){
                prev.next = p1;
                prev = p1;
            }
            p1 = p1.next;
        }
        
        prev.next = p1;
        prev = p1;
        
        return A;

    }
}
