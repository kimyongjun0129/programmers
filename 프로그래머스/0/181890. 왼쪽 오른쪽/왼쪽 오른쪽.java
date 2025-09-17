import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if ("l".equals(str_list[i])) {
                // 왼쪽 부분
                String[] answer = new String[i];
                for (int j = 0; j < i; j++) {
                    answer[j] = str_list[j];
                }
                return answer;
            } else if ("r".equals(str_list[i])) {
                // 오른쪽 부분
                String[] answer = new String[str_list.length - i - 1];
                for (int j = i + 1; j < str_list.length; j++) {
                    answer[j - i - 1] = str_list[j];
                }
                return answer;
            }
        }
        // i/r를 못 찾은 경우: 빈 배열 반환
        return new String[0];
    }
}
