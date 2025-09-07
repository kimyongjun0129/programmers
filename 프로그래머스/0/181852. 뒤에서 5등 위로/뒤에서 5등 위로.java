class Solution {
    public int[] solution(int[] num_list) {
        
        for (int i=1; i<num_list.length; i++) {
            for (int j=i; j<num_list.length; j++) {
                if (num_list[i-1] > num_list[j]) {
                    int temp = num_list[j];
                    num_list[j] = num_list[i-1];
                    num_list[i-1] = temp;
                }
            }
        }
        
        
        int[] answer = new int[num_list.length-5];
        
        for (int l=5; l<num_list.length; l++) {
            answer[l-5] = num_list[l];
        }
        
        return answer;
    }
}