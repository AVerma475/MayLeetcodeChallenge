/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1 ){
            if(isBadVersion(n))
                return 1;
        }
        
        int s =0, e = n+1;
        
        while(s < e)
        {
            int mid = s+ (e-s)/2;
            
            if(isBadVersion(mid) && !isBadVersion(mid-1))
            {
                return mid;
            }
            
            else if(!isBadVersion(mid))
            {
                s = mid+1;
            }
            else 
                e = mid;
        }
        if(s!=n+1 && isBadVersion(s))
            return s;
        return n;
            
    }
}
