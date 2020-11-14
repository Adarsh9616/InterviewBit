public class Solution {
    public int removeElement(ArrayList<Integer> a, int b) 
    {
        int n = a.size() ;
    int i =  0 ; 
    int index = 0 ; 
    
    while( i <  n )
{
    if( a.get(i) != b )
    {
        a.set( index , a.get(i) ) ;
    
         index ++ ;    
    }
    
    
    i++ ;
}

    return index ;
    }
}
