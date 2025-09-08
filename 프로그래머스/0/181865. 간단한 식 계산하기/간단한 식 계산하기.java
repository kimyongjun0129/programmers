class Solution {
    public int solution(String binomial) {
        String[] answer = binomial.split(" ");
        
        switch(answer[1]) {
            case "+":
                return Integer.parseInt(answer[0]) + Integer.parseInt(answer[2]);
            case "-":
                return Integer.parseInt(answer[0]) - Integer.parseInt(answer[2]);
            case "*":
                return Integer.parseInt(answer[0]) * Integer.parseInt(answer[2]);
            default:
                return 0;
        }
    }
}