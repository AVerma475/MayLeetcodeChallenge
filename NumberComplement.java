class Solution {
    public int findComplement(int N) {
              int X = 1;
        while (N > X) X = X * 2 + 1;
        return X - N;
        
    }
}
