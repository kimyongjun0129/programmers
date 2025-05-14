class Solution {
    public String solution(String s) {
        int len = s.length();
        StringBuilder builder = new StringBuilder();
        
        if(len%2==1) return builder.append(s.charAt(len/2)).toString();
        else return builder.append(s.charAt(len/2-1)).append(s.charAt(len/2)).toString();
    }
}