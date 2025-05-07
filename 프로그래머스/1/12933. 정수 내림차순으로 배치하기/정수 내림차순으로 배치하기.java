import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        
        Arrays.sort(str);
        
        StringBuilder result = new StringBuilder();
        for(String a : str) {
            result.append(a);
        }
        return Long.parseLong(result.reverse().toString());
    }
}