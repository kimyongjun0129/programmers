class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) answer = true;
        else answer = false;
        char[] result = s.toCharArray();
        for(char a : result) {
            if(10 < a - '0') answer = false;
        }
        
        return answer;
    }
}