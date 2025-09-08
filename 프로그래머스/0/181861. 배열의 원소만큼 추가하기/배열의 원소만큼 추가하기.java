class Solution {
    public int[] solution(int[] arr) {
        int total_length = 0;
        for (int num: arr) {
            total_length += num;
        }
        
        
        int[] answer = new int[total_length];
        int index=0;
        for (int num: arr) {
            for (int i=index; i<num+index; i++) {
                answer[i] = num;
            }
            index+=num;
        }

        return answer;
    }
}