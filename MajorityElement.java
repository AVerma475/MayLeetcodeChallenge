class Solution {
    public int majorityElement(int[] nums) {
       int m = -1;
        int i =0;
       for(int j =0; j<nums.length;j++) {
           if(i == 0){
               m = nums[j];
                i = 1;}
           else if(m == nums[j])
               i++;
           else
               i--;
       }
        return m;
        
        }
}
