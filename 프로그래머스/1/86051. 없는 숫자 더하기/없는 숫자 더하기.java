import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> arr = new ArrayList<>();
        int sum = 0;
        int cnt = 0;
        
        for (int num : numbers) {
            arr.add(num);
        }
        
        Collections.sort(arr);
        
        for (int i = 0; i <= 9; i++) {
            if (cnt >= arr.size() || arr.get(cnt) != i) {
                sum += i;
            } else {
                cnt++;
            }
        }
        
        return sum;
    }
}
