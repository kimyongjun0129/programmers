import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++) {
            if (isZeroOrFive(i)) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) return new int[]{-1};
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
    
    private boolean isZeroOrFive(int n) {
        while(n>0) {
            int digit = n % 10;
            if (digit != 0 && digit != 5) return false;
            n /= 10;
        }
        return true;
    }
}