public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) 
    {
        int oneTimes=0;
        int twoTimes=0;
        for(int i:A)
        {
            oneTimes=(oneTimes^i)&(~twoTimes);
            twoTimes=(twoTimes^i)&(~oneTimes);
        }
        return oneTimes;
    }
}
