class Solution {
    public boolean checkStraightLine(int[][] arr) {
        if(arr.length == 2)return true;
        
        int x = Math.abs(arr[0][0] - arr[1][0]);
        int y = Math.abs(arr[0][1] - arr[1][1]);
    
        for(int i = 1;i<arr.length-1;i++){
             int x_ = Math.abs(arr[i][0] - arr[i+1][0]);
             int y_ = Math.abs(arr[i][1] - arr[i+1][1]);
            if((x_*y) != (x*y_)) return false; // Slopes between 2 points are always equal in straight line
        }       
        return true;
    }
    }
