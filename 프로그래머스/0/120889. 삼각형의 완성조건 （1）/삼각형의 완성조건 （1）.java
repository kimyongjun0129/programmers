class Solution {
    public int solution(int[] sides) {
        int bigNum = 0;
        int sum = 0;
        for (int a : sides) {
            if (a>bigNum) bigNum = a;
            sum += a;
        }
        
        return bigNum < sum-bigNum ? 1 : 2;
    }
}