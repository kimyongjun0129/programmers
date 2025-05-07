import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        // 1. n을 문자열로 변환
        String str = Long.toString(n);
        
        // 2. 문자 배열로 변환
        Character[] arr = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        
        // 3. 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        
        // 4. 정렬된 문자 배열을 다시 문자열로 합침
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        
        // 5. 결과 문자열을 long으로 변환하여 리턴
        return Long.parseLong(sb.toString());
    }
}