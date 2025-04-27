class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int num = x;
        
        while(true) {
            sum+=x%10;
            
            if(x<1) break;
            
            x/=10;
        }
        
        return num%sum == 0 ? true : false;
    }
}