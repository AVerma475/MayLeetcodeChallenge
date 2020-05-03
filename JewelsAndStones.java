class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] arr = new int[256];
            for(int i =0; i<J.length();i++){
                arr[J.charAt(i)+0] = 1; 
            }
        int ans = 0;
        for(int i =0; i<S.length();i++){
            if(arr[S.charAt(i)+0] == 1)
                ans++;
        }
             return ans;
        }
}
