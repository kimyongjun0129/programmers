class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int count = 0;
        
        for(int i=1; i<=max; i++) {
            if(i+min>max) count++;
        }
        
        for(int i=1; i<max+min; i++) {
            if(i>max && max+min>i) count++;
        }
        
        return count;
    }
}