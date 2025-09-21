import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        
        String[] answers = myStr.split("[abc]+");
        
        for(String answer : answers) {
            if (!answer.equals("")) list.add(answer);
        }
        
        if (list.isEmpty()) return new String[]{"EMPTY"};
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}