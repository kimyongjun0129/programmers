import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> result = new ArrayList<>();
        
        for (int num: arr) {
            result.add(num);
        }
        
        for (int num: arr) {
            for (int delete_num: delete_list) {
                if (num == delete_num) result.remove(Integer.valueOf(num));
            }
        }

        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}