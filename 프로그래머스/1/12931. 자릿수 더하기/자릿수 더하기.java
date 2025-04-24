import java.util.*;

public class Solution {
    public int solution(int n) {
        int positionNum = Integer.toString(n).length();
        int multiNum = 1;
        int sum = 0;
        
          
        // 자리수를 나누기 위한 수 셋팅
        for (int i = 1; i<positionNum; i++) {
            multiNum *= 10;
        }
        
        // 셋팅 값으로 나누기, 나머지 연산을 통해 각 자리의 값 구하기
        for(int i = 0; i<positionNum; i++) {
            sum += (n/multiNum);
            n %= multiNum;
            multiNum /= 10;
        }

        return sum;
    }
}