import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        
        String[] result = new String[quiz.length];
        Arrays.fill(result, "X");
        int count = 0;
        
        for(String oneQuiz: quiz) {
            String[] a = oneQuiz.split(" ");
            int first = Integer.parseInt(a[0]);
            int second = Integer.parseInt(a[2]);
            int answer = Integer.parseInt(a[4]);
            String op = a[1];
            
            switch(op) {
                case "+":
                    if(first + second == answer) result[count] = "O";
                    break;
                case "-":
                    if(first - second == answer) result[count] = "O";
                    break;
            }
            count++;
        }
        
        return result;
    }
}