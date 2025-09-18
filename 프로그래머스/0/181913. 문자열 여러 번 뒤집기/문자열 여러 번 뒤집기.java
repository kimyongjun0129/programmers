class Solution {
    public String solution(String my_string, int[][] queries) {
        
        char[] list = my_string.toCharArray();
        
        for (int[] querie: queries) {
            int first = querie[0];
            int second = querie[1];
            
            for (int i=first; i<=second; i++) {
                char temp = list[second];
                list[second--] = list[i];
                list[i] = temp;
            }
        }
        
        return String.valueOf(list);
    }
}