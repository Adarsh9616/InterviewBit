/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution implements Comparator<ListNode>
{
    public int compare(ListNode a,ListNode b)
    {
        return a.val-b.val;
    }
    public ListNode mergeKLists(ArrayList<ListNode> a) 
    {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(new Solution());
        ListNode ans=new ListNode(0);
        ListNode t=ans;
        for(ListNode l:a)
        {
            pq.add(l);
        }
        while(!pq.isEmpty())
        {
            ListNode temp=pq.poll();
            //System.out.print(temp.val);
            ListNode next=temp.next;
            temp.next=null;
            ans.next=temp;
            ans=ans.next;
            if(next!=null)
            {
                pq.add(next);
            }
        }
        return t.next;
    }
}
