import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        int index = 0;
        for (int i=0; i<arr.length; i++) {
            
            boolean flag = false;
            
            for (int j=0; j<answer.length; j++) {
                
                if (arr[i] == answer[j]) flag = true;
            }
            if(!flag) answer[index++] = arr[i];
            if(index==answer.length) return answer;
        }
        return answer;
    }
}