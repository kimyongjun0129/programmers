class Solution {
    public String solution(String rny_string) {
        int n = rny_string.length();
        char[] str = rny_string.toCharArray();
        
        for(char word : str) {
            if(word=='m') n++;
        }
        
        char[] new_str = new char[n];
        int index = 0;
        for(int i = 0; i<str.length; i++) {
            if(str[i] == 'm') {
                new_str[i+index] = 'r';
                new_str[i+index+1] = 'n';
                index++;
            } else {
                new_str[i+index] = str[i];
            }
        }
        return String.valueOf(new_str);
    }
}