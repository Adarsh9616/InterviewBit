/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A, int B) 
    {
        int count = 0;

        ListNode temp = A;
    
        while (temp != null) {
            count++;
            temp = temp.next;
        }
    
        int middle = (count / 2) + 1;
        int fromStart = middle - 1 - B;
    
        if (fromStart < 0)
            return -1;
    
        ListNode temp1 = A;
    
        while (fromStart > 0) {
            fromStart--;
            temp1 = temp1.next;
        }
    
        return temp1.val;
    }
}
