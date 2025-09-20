class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<code.length(); i++) {
            if (mode == 0) {    // mode 0
                if (code.charAt(i) == '1') {
                    mode = 1;
                } else {
                    if (i%2==0) sb.append(code.charAt(i));
                }
            } else {    // mode 1
                if (code.charAt(i) == '1') {
                    mode = 0;
                } else {
                    if (i%2!=0) sb.append(code.charAt(i));
                }
            }
        }
        
        if (sb.length() == 0) sb.append("EMPTY");

        return sb.toString();
    }
}