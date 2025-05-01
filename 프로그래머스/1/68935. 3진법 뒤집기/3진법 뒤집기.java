class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder builder = new StringBuilder();
        
        while (n>=1) {
            builder.append(n%3);
            
            n/=3;
        }
        
        String num = builder.toString();
        int count = 1;
        for (int i = num.length()-1; 0 <= i; i--) {
            if (i == num.length()-1) answer += (num.charAt(i)-'0')*1;
            else answer += (num.charAt(i)-'0') * Math.pow(3, count++);
        }
        
        return answer;
    }
}