import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> seen = new HashSet<>();
        int i = 2;
        
        while(n>=i) {
            if(n%i == 0) {
                if (seen.add(i)) {
                    answer = Arrays.copyOf(answer, answer.length + 1);
                    answer[answer.length - 1] = i;
                }
                n /= i;
            } else {
                i++;
            }
        }     
        
        return answer;
    }
}