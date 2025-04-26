class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(b<a) {
            int temp = 0;
            temp = a;
            a = b;
            b = temp;
        }
        
        for (;a<=b;a++) {
            answer += a;
        }
        return answer;
    }
}