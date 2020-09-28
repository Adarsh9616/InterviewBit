public class Solution {
    public int solve(int n, ArrayList<Integer> B) 
    {
        int cnt[] = new int[n]; 
        int sum = 0; 
        for (int i = 0 ; i < n ; i++) 
        { 
            s += B.get(i); 
        } 
        
        if (sum % 3 != 0) 
            return 0; 
            
        sum /= 3; 
          
        int ss = 0; 
        
        for (int i = n-1; i >= 0 ; i--) 
        { 
            ss += B.get(i); 
            if (ss == sum) 
                cnt[i] = 1; 
        } 
        for (int i = n-2 ; i >= 0 ; i--) 
            cnt[i] += cnt[i + 1]; 
          
        int ans = 0; 
        
        ss = 0; 
        for (int i = 0 ; i+2 < n ; i++) 
        { 
            ss += B.get(i); 
            if (ss == sum) 
                ans += cnt[i + 2]; 
        } 
        return ans; 
    }
}
