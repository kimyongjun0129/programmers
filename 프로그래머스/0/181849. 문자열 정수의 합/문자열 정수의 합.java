class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for(char word: num_str.toCharArray()) {
            answer += (int)(word - '0');
        }
    
        return answer;
    }
}