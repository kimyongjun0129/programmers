import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int total = 45;
        int sum = 0;
        
        for (int num : numbers) {
            total -= num;
        }
        
        return total;
    }
}
