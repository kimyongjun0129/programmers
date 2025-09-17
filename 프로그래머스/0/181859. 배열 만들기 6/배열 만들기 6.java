import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
            }
            else if (stk.size() != 0 && stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
            }
            else if (stk.size() != 0 && stk.get(stk.size() - 1) != arr[i]) {
                stk.add(arr[i]);
            }
        }
        
        // 빈 배열인 경우 빠른 리턴
        if (stk.size() == 0) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        int[] answer = new int[stk.size()];
        for (int j=0; j<stk.size(); j++) {
            answer[j] = stk.get(j);
        }
        
        return answer;
    }
}