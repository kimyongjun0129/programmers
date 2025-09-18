import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");

        Arrays.sort(answer);
        
        int index = 0;
        for(int i=0; i<answer.length; i++) {
            if (!answer[i].equals("")) {
                index = i;
                break;
            }
        }
        
        return Arrays.copyOfRange(answer, index, answer.length);
    }
}