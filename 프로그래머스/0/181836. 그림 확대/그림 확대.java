import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (String pixel: picture) {
            for (char bit: pixel.toCharArray()) {
                for (int i=0; i<k; i++) {
                    sb.append(bit);
                }
            }
            for (int j=0; j<k; j++) {
                list.add(sb.toString());
            }
            sb.setLength(0);
        }
        
        String[] answer = new String[list.size()];
        for (int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}