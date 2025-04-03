class Solution {
    public String[] solution(String my_str, int n) {
        int section = 0;
        int save = 0;
        
        if (my_str.length()%n==0) {
            section = my_str.length()/n;
        }
        else {
            section = my_str.length()/n + 1;
        }
        String[] answer = new String[section];

        for (int i = 0; i < section; i++) {
            if (save + n > my_str.length()) {
                answer[i] = my_str.substring(save);
            } else {
                answer[i] = my_str.substring(save, save + n);
            }
            save += n;
        }
        return answer;
    }
}
