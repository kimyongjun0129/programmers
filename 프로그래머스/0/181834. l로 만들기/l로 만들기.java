class Solution {
    public String solution(String myString) {
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's'
                            ,'t', 'u', 'v', 'w', 'x', 'y', 'z'};
        int l_index = 11;
        int index = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for(char word: myString.toCharArray()) {
            int ap_index = 0;
            
            for (char alphabet: alphabets) {
                if(word==alphabet && ap_index <l_index) sb.append('l');
                else if (word==alphabet && ap_index >= l_index) sb.append(word);
                
                ap_index++;
            }

            index++;
        }

        return sb.toString();
    }
}