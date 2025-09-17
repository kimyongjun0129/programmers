import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        int[] answer = new int[52];
        
        for (char word : my_string.toCharArray()) {
            if(word - 'A' < 26) {
                answer[word - 'A']++; 
            } else {
                answer[word - 'a' + 26]++; 
            }
        }
        
        return answer;
    }
}