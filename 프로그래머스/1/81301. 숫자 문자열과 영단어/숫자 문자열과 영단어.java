import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String s) {
        Map<String, Integer> numbers = Map.of(
            "zero",0,
            "one",1,
            "two",2,
            "three",3,
            "four",4,
            "five",5,
            "six",6,
            "seven",7,
            "eight",8,
            "nine",9
        );
        
        char[] list = s.toCharArray();
        StringBuilder str = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < list.length; i++) {
            char c = list[i];
            if ('a' <= c && c <= 'z') {
                str.append(c);
                if (numbers.containsKey(str.toString())) {
                    result.append(numbers.get(str.toString()));
                    str.setLength(0);
                }
            } else {
                result.append(c);
            }
        }

        
        return Integer.parseInt(result.toString());
    }
}