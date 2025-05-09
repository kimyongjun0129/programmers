import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        int len = 0;
        int cnt = 0;
        
        // 나누어 떨어지는 수 찾기
        for(int num : arr) {
            if(num%divisor==0) len++;
        }
        
        if (len==0) len++;
        
        int[] result = new int[len];
        
        // 나누어 떨어지는 수 배열 만들기
        for(int num : arr) {
            if(num%divisor==0) result[cnt++]=num;
        }
        if (result[0] == 0) result[0] = -1;
        return result;
    }
}