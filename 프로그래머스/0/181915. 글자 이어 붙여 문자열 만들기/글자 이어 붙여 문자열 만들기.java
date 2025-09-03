class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        char[] charList = my_string.toCharArray();
        
        for(int index: index_list) {
            sb.append(charList[index]);
        }
        return sb.toString();
    }
}