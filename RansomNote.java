class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        // for storing characters
        int[] arr= new int[26]; 
        
        //storing frequency of each character
        for(int i =0; i<ransomNote.length();i++){
            arr[ransomNote.charAt(i)-'a']+= 1;
        }
        
        // Negating the freq if character is found in Magazine
       for(int i =0; i<magazine.length();i++){
            arr[magazine.charAt(i)-'a']-= 1;
        }
        
        // checking if any character of Ransom String has freq > 1
        for(int i = 0;i<26;i++){
            if(arr[i] > 0) return false;
        }
        return true;
    }
}
