import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        
        while (arr.length > i) {
            if (stk.size() != 0 && stk.get(stk.size() - 1) >= arr[i]) {
                stk.pop();
            } else {
                stk.push(arr[i]);
                i++;
            }
        }
        
        int[] answer = new int[stk.size()];
        for (int j=0; j<stk.size(); j++) {
            answer[j] = stk.get(j);
        }
        
        return answer;
    }
}

