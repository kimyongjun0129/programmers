class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 약수 : 어떤 수를 나누어 떨어지게 하는 수
        
        // 1~절반
        for(int i=1; i<=(n/2); i++) {
            if(n%i==0) answer+=i;
        }
        
        // 본인
        answer+=n;
        
        return answer;
    }
}