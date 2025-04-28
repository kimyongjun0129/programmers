class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int pCnt = 0;
        int yCnt = 0;
        
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == 'p') pCnt++;
            else if(s.charAt(i) == 'y') yCnt++;
        }
        
        if(pCnt == 0 && yCnt == 0) return true;
        if(pCnt == yCnt) return true;
        else return false;
    }
}