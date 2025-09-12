class Solution {
    public int solution(int[] num_list) {
        int index = 0;
        
        for (int num: num_list) {
            if(num < 0) break;
            index++;
        }
        
        if(index==num_list.length) index = -1;
        
        return index;
    }
}