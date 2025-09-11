class Solution {
    public String[] solution(String my_string) {
        String[] answers = my_string.split(" ");
        int index = 0;
        
        for(String answer: answers) {
            if (!answer.equals("")) index++;
        }
        
        String[] result = new String[index];
        index = 0;
        for(int i=0; i<answers.length; i++) {
            if (!answers[i].equals("")) result[index++] = answers[i];
        }
        
        return result;
    }
}