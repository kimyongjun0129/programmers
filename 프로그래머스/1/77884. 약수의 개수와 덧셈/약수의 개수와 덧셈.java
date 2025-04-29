class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        
        for(;left<=right; left++) {
            int count = 0;
            for(int i = 1; i<= Math.sqrt(left); i++) {
                if (left%i==0) {
                    count++;
                    
                    if (i != left/i) count++;
                }
            }
            
            if (count%2==0) sum+=left;
            else sum-=left;
        }
        return sum;
    }
}