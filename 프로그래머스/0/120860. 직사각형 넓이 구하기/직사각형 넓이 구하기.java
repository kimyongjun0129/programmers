class Solution {
    public int solution(int[][] dots) {
        int x = 0;
        int y = 0;
        
        for(int i=0; i<dots.length; i++) {
            for(int j=1; j<dots.length; j++) {
                if(dots[i][0] == dots[j][0]) {
                    if(dots[i][1] != dots[j][1]) {
                        y= dots[i][1]>dots[j][1] ? dots[i][1] - dots[j][1] : dots[j][1] - dots[i][1];
                    }
                }
                if(dots[i][1] == dots[j][1]) {
                    if(dots[i][0] != dots[j][0]) {
                        x= dots[i][0]>dots[j][0] ? dots[i][0] - dots[j][0] : dots[j][0] - dots[i][0];
                    }
                }
            }
        }

        return x * y;
    }
}