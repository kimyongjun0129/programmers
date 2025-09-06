class Solution {
    public String solution(String n_str) {
        return n_str.substring(zeroIndex(n_str));
    }
    
    public int zeroIndex(String n_str) {
        int index = 0;
        
        for(int i=0; i<n_str.length(); i++) {
            if(n_str.charAt(i)=='0') index++;
            else return index;
        }
        return index;
    }
}