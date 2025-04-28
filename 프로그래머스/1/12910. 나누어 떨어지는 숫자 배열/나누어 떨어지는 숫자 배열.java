import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        int len = 0;
        int cnt = 0;
        
        for(int num : arr) {
            if(num%divisor==0) len++;
        }
        
        if (len==0) len++;
        
        int[] result = new int[len];
        
        for(int num : arr) {
            if(num%divisor==0) result[cnt++]=num;
        }
        if (result[0] == 0) result[0] = -1;
        return result;
    }
}