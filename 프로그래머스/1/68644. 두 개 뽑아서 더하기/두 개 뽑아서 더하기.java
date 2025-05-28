import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> result = new TreeSet<>();
        
        // 두 개의 인덱스 더하기
        for(int i = 0; i<numbers.length; i++) {
            for (int j = i+1; j<numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }

        // set -> int[]로 변환
        int[] answer = new int[result.size()];
        int index = 0;
        for(int num : result) {
            answer[index++] = num;
        }
        return answer;
    }
}