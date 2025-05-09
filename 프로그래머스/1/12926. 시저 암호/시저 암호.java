class Solution {
    public String solution(String s, int n) {
        char[] list = s.toCharArray();
        
        for(int i = 0; i<list.length; i++) {
            if('A' <= list[i] && list[i] <= 'Z') list[i] = (char)('A' + (list[i] - 'A' + n) % 26);
            if('a' <= list[i] && list[i] <= 'z') list[i] = (char)('a' + (list[i] - 'a' + n) % 26);
        }
        return String.valueOf(list);
    }
}