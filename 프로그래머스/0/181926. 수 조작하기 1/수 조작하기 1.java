class Solution {
    public int solution(int n, String control) {
        char word;
        
        for(int i=0; i<control.length(); i++) {
            word = control.charAt(i);
            if (word == 'w') n+=1;
            else if (word == 's') n-=1;
            else if (word == 'd') n+=10;
            else if (word == 'a') n-=10;
        }

        return n;
    }
}