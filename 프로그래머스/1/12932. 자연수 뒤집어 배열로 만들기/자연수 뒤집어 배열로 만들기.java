import java.util.*;

class Solution {
    public List<Long> solution(long n) {
        // 1. 일의자리부터 끝까지 역순으로 계산하여 배열에 저장
        List<Long> result = new ArrayList<>();
        long temp=0;
        while(true) {
            temp=(n%10);
            
            if(n==0) break;
            
            n/=10;
            
            result.add(temp);
        }
        
        return result;
    }
}