class Solution {
    public String solution(String myString) {
        char[] answer = myString.toCharArray();
        
        for (int i=0; i<answer.length; i++) {
            if(answer[i] == 'a') answer[i] = 'A';
            else if (answer[i] > 'A' && answer[i] < 'Z') answer[i] = (char)(answer[i] - 'A' + 'a');
        }

        return String.valueOf(answer);
    }
}

