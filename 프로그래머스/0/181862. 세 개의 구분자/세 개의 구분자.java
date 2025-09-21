import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (char myChar : myStr.toCharArray()) {
            if(myChar == 'a'|| myChar == 'b' || myChar == 'c') {
                if(sb.length() != 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
                continue;
            }
            else {
                sb.append(myChar);
            }
        }
        if (sb.length() != 0) {
            list.add(sb.toString());
        }
        
        if (list.isEmpty()) return new String[] {"EMPTY"};
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++) {
            if(!list.get(i).equals("")) {
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}