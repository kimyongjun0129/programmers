class Solution {
    public int solution(int n) {
        int count=2;
        
        while (true) {
            if(n%count==1) break; 
            count++;
        }
        return count;
    }
}