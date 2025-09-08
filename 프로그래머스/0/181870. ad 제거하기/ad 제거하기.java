class Solution {
    public String[] solution(String[] strArr) {
        int index = 0;
        
        for (String str: strArr) {
            if (!str.contains("ad")) index++;
        }
        
        String[] answer = new String[index];
        index = 0;
        for (String str: strArr) {
            if (!str.contains("ad")) {
                answer[index] = str;
                index++;
            }
        }
        
        return answer;
    }
}

