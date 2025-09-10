class Solution {
    public int[] solution(String myString) {
        String[] answers = myString.split("x");
        int[] result;
        
        if (myString.endsWith("x")) {
            result = new int[answers.length+1];
            
            for (int i=0; i<answers.length; i++) {
                result[i] = answers[i].length();
            }
            result[answers.length] = 0;
        } else {
            result = new int[answers.length];
            
            for (int i=0; i<answers.length; i++) {
                result[i] = answers[i].length();
            }
        }
         
        return result;
    }
}