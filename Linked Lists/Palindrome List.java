/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A)
    {
        long len = 0;
    for(ListNode a=A; a != null; a = a.next, len++);
    
    if(len < 2) {
        return 1;
    }
    
    //traverse to the staring point of second half
    //for odd length list you need to jump over the extra val in middle which is not relevant
    long half = len/2;
    ListNode sh = A;
    for(long i=1; sh!=null && i <= half; i++) {
        sh = sh.next;
    }
    if(len%2 != 0) {
        sh = sh.next;
    }
    
    //reverse the second half (sh) of the linked list
    ListNode pa = null;
    for(ListNode a=sh; a != null;) {
        ListNode na = a.next;
        a.next = pa;
        pa = a;
        a = na;
    }
    sh = pa;

    
    //compare both first & second halfs (fh, sh)
    ListNode fh = A;
    long i = 1;
    for(; i <= half && fh.val == sh.val; i++, fh = fh.next, sh = sh.next);
    
    return i > half ? 1 : 0;
    }
}
