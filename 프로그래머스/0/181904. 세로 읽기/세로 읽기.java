class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        
        for(int j=0; j<my_string.length(); j+=m) {
            for(int i=j; i<m+j; i++) {
                if(i==c-1+j) sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}