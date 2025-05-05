class Solution {
    public String solution(String rny_string) {
        // m -> rn
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < rny_string.length(); i ++){
            char word = rny_string.charAt(i);

            if(word == 'm'){
                builder.append("rn");
            }
            else{
                builder.append(word);
            }

        }

        return builder.toString();
    }
}