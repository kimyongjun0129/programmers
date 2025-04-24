import java.util.*;

class Solution {
    public List solution(long n) {
        // 1. long -> list로 변경 (Long 타입을 list로는 바로 변경하지 못하는거 같음)
        // 2. 일의자리부터 끝까지 역순으로 계산하여 배열에 저장
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