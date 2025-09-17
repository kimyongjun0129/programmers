import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        
        while (arr.length > i) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else if (stk.size() != 0 && stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else if (stk.size() != 0 && stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
            }
        }
        
        int[] answer = new int[stk.size()];
        for (int j=0; j<stk.size(); j++) {
            answer[j] = stk.get(j);
        }
        
        return answer;
    }
}