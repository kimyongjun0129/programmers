import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        
        Map<Integer, Integer> map = new TreeMap<>();
        
        for (String str: strArr) {
            if (map.get(str.length()) != null) {
                int time = map.get(str.length());
                time++;
                map.put(str.length(), time);
            } else {
                map.put(str.length(), 1);
            }
        }
        
        int key = 0;
        int value = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(value < entry.getValue()) {
                key = entry.getKey();
                value = entry.getValue();
            }
        }
        
        return value;
    }
}