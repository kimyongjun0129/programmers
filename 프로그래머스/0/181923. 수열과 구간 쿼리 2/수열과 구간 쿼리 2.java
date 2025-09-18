class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int index = 0;
        
        for (int[] querie : queries) {
            int s = querie[0];
            int e = querie[1];
            int k = querie[2];
            int save = 1000000;
            
            for (;s<=e; s++) {
                if (arr[s] > k && arr[s] < save) save = arr[s]; 
            }
            answer[index++] = save != 1000000 ? save : -1;
        }
        return answer;
    }
}