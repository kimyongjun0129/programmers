import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        // 배열의 길이가 1인 경우 [-1] 반환
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 가장 작은 값 찾기
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        // 가장 작은 값을 제외하고 새 배열 만들기
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int num : arr) {
            if (num != min) {
                answer[index++] = num;
            }
        }

        return answer;
    }
}
