import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();
        
        for (int num : arr) {
            if(num%divisor==0) result.add(num);
        }
        Collections.sort(result);
        if(result.isEmpty()) result.add(-1);
        return result;
    }
}