class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);
      
	      if (answer == 0) {
		        int sum1 = 0;
		        int sum2 = 0;
		          
		        for(int num1:arr1) sum1+=num1;
		        for(int num2:arr2) sum2+=num2;
		        
		        answer = Integer.compare(sum1, sum2);
	      }

        return answer;
    }
}