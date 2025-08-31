import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] results = new String[my_string.length()];
        for(int i=0; i<my_string.length(); i++) {
            results[i] = my_string.substring(i,my_string.length());
        }
        
        Arrays.sort(results);
        
        return results;
    }
}