class Solution {
    public int solution(String myString, String pat) {
        int time = 0;
        int index = 0;
        
        while(true) {
            index = myString.indexOf(pat);
            if (index < 0) break;
            myString = myString.substring(index+1, myString.length());
            time++;
        }
        
        return time;
    }
}