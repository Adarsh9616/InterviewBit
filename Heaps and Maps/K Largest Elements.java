public class Solution {
        public int[] solve(int[] A, int B) 
        {
            int ans[]=new int[B];
            int m=ans.length-1;
            PriorityQueue<Integer> queue=new PriorityQueue<>();
            for(int num:A)
            {
                queue.offer(num);
                if(queue.size()>B)
                {
                    queue.poll();
                }
            }
            while(!queue.isEmpty())
            {
                ans[m--]=queue.poll();
            }
            return ans;
            
            
        }
    }