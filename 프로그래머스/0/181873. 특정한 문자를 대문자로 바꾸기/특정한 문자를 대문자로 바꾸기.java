class Solution {
    public String solution(String my_string, String alp) {
        char[] results = new char[my_string.length()];
        
        for (int i=0; i<my_string.length(); i++) {
            if (my_string.charAt(i) == alp.charAt(0)) {
                results[i] = (char)(my_string.charAt(i) - 'a' + 'A'); 
            } else {
                results[i] = my_string.charAt(i);
            }
        }
        return String.valueOf(results);
    }
}