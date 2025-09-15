import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (String str: strArr) {
            if (map.get(str.length()) != null) {
                int time = map.get(str.length());
                time++;
                map.put(str.length(), time);
            } else {
                map.put(str.length(), 1);
            }
        }
        
        int value = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(value < entry.getValue()) {
                value = entry.getValue();
            }
        }
        
        return value;
    }
}