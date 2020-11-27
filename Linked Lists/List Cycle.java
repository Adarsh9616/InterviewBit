/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode a) 
    {
        HashSet<ListNode> hs = new HashSet<ListNode>(); 
        while (true) { 
            if(a==null)
                return null;
            if (hs.contains(a)) 
                return a; 
            hs.add(a); 
            a = a.next; 
        }
    }
}
