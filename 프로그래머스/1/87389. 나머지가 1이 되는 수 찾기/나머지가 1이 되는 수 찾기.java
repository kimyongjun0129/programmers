class Solution {
    public int solution(int n) {
        if (n%2==0) {
            for (int i = 3; i<= n; i+=2) {
                if(n%i==1) return i;
            }
        } else {
            for (int i = 2; i<= n; i+=2) {
                if(n%i==1) return i;
            }
        }
        return 0;
    }
}