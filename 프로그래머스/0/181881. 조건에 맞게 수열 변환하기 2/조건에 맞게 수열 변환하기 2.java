class Solution {
    public int solution(int[] arr) {
        int time = 0;
        int check = arr.length;
        
        while(true) {
            check = arr.length;
            for (int i=0; i<arr.length; i++) {
                if(arr[i] >= 50 && arr[i]%2==0) arr[i]/=2;
                else if(arr[i] < 50 && arr[i]%2==1) arr[i]=arr[i]*2+1;
                else check--;
            }
            
            if(check == 0) break;
            time++;
        }

        return time;
    }
}