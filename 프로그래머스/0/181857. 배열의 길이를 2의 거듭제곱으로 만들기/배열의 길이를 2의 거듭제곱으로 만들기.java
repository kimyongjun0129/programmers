class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;
        int num = 2;
        
        if(size == 1) return arr;
        
        while(size > num) {
            num*=2;
        }
        
        int[] answer = new int[num];
        for(int i=0; i<num; i++) {
            if(i<size) answer[i] = arr[i];
            else answer[i] = 0;
        }
        
        return answer;
    }
}