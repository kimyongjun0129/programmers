class Solution {
    public int solution(int[] num_list) {
        int even_sum = 0;
        int odd_sum = 0;
        
        
        for (int i=0; i<num_list.length; i++) {
            if(i%2==0) even_sum+=num_list[i];
            else odd_sum+=num_list[i];
        }
        
        return even_sum > odd_sum ? even_sum : odd_sum;
    }
}