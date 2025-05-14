import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        int resultIndex = 0;
        System.out.println(commands.length);
        for (int i = 0; i<commands.length; i++) {
            // 구간 나누기 (동적 배열)
            int size = commands[i][1] - commands[i][0] + 1; // 5 - 2 + 1 = 4
            int index = commands[i][0]-1;
            int[] answer = new int[size];
            for (int j = 0; j < size; j++) {
                answer[j] = array[index++];
            }
        
            // 정렬하기
            Arrays.sort(answer);

            // k번째 수 구하기
            result[resultIndex++] = answer[commands[i][2]-1];
        }
        
        return result;
    }
}