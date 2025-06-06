class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for(int i = 0; i<absolutes.length; i++) {
            sum = signs[i] == true ? sum+absolutes[i] : sum-absolutes[i];
        }
        
        return sum;
    }
}