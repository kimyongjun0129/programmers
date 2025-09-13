class Solution {
    public String solution(String my_string, int[] indices) {
        int exclude_size = my_string.length() - indices.length;
        
        char[] answer = new char[exclude_size];
        int index = 0;
        
        for (int i=0; i<my_string.length(); i++) {
            if(!check(indices, i)) answer[index++] = my_string.charAt(i);
        }

        return String.valueOf(answer);
    }
    
    public boolean check(int[] indices, int num) {
        for (int indice: indices) {
            if (num == indice) return true;
        }
        return false;
    }
}