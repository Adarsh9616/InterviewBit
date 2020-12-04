public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> a)
    {
        Integer[] arr = a.toArray(new Integer[0]);

      int ans = 0;
      int i = 0;
      int j = arr.length - 1;
      int lMax = arr[i];
      int rMax = arr[j];
    
      while (i < j) {
      	if (lMax > rMax) {
      		ans += rMax - arr[j];
      		rMax = Math.max(rMax, arr[--j]);
      	} else {
      		ans += lMax - arr[i];
      		lMax = Math.max(lMax, arr[++i]);
      	}
      }
      return ans;
    }
}
