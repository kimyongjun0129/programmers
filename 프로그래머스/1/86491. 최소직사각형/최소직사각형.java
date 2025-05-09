class Solution {
    public int solution(int[][] sizes) {
        int num1 = 0;
        int num2 = 0;
        
        // 최대로 포함해야 되는 수
        for (int i = 0; i<sizes.length; i++) {
            int big = 0;
            int small = 0;
            
            // 두 수 대소 비교
            if (sizes[i][0] > sizes[i][1]) {
                big = sizes[i][0];
                small = sizes[i][1];
            } else {
                big = sizes[i][1];
                small = sizes[i][0];
            }
            
            // 값 넣기
            if (big > num1) num1 = big;
            if (small > num2) num2 = small;
        }
        return num1*num2;
    }
}