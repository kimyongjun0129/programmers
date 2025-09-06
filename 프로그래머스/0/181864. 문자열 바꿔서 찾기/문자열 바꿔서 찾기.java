class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        for (char word: myString.toCharArray()) {
            if (word == 'A') sb.append('B');
            else if (word == 'B') sb.append('A');
        }
        
        String result = sb.toString();
        
        if (result.contains(pat)) return 1;
        else return 0;
    }
}