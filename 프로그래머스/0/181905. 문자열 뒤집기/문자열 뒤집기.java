class Solution {
    public String solution(String my_string, int s, int e) {
        String subString = my_string.substring(s, e+1);
        StringBuilder sb = new StringBuilder();
        
        sb.append(my_string.substring(0,s));
        
        for (int i=subString.length()-1; i>=0; i--) {
            sb.append(subString.charAt(i));
        }
        
        sb.append(my_string.substring(e+1, my_string.length()));
        
        return sb.toString();
    }
}