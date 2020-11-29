public class Solution {
public ListNode solve(ListNode head, int k) 
{

    if(head==null)
        return null;
    
    ListNode curr=head,prev=null, next=head;
    int i=1;
    while(i<=k&&curr!=null)
    {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        i++;
    }

    head.next=next;
     i=1;
    //move k nodes
    while(i<k&&curr!=null)
    {
        curr=curr.next;
        i++;
    }
    
    if(curr!=null)
         curr.next=solve(curr.next,k);
        
        return prev;
        
    }
}
