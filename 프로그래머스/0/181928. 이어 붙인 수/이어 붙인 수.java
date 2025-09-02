class Solution {
    public int solution(int[] num_list) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        
        for (int num: num_list) {
            if (num%2==0) even.append(num);
            else odd.append(num);
        }
        
        int even_num = Integer.valueOf(even.toString());
        int odd_num = Integer.valueOf(odd.toString());
        
        return even_num + odd_num;
    }
}