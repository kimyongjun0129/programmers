class Solution {
    public int solution(String A, String B) {
        
        char[] words = A.toCharArray();
        int size = A.length();
        int count = 0;
        
        if(A.equals(B)) return 0;
        
        for(int j=0; j<size; j++) {
            char temp = words[size-1];;
            for(int i=size-1; i>0; i--) {
                words[i] = words[i-1];
            }
            words[0] = temp;
            count++;
            
            if(String.valueOf(words).equals(B)) return count;
        }

        return -1;
    }
}