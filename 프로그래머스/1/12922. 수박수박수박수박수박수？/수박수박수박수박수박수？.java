class Solution {
    public String solution(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i<n/2; i++) {
            builder.append("수박");
        }
        if(n%2!=0) builder.append("수");
        return builder.toString();
    }
}