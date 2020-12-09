/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) 
    {
        HashMap<RandomListNode,RandomListNode> map=new HashMap<>();
        RandomListNode temp=head;
        while(temp!=null)
        {
            map.put(temp,new RandomListNode(temp.label));
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            RandomListNode t=map.get(temp);
            RandomListNode next=temp.next;
            t.next=map.get(next);
            next=temp.random;
            t.random=map.get(next);
            temp=temp.next;
        }
        return map.get(head);
    }
}
