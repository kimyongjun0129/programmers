class Solution {
    public int solution(String my_string) {
        String[] list = my_string.split(" ");
        int answer = 0;
        
        for (int i = 1; i<list.length; i+=2) {
            switch (list[i]) {
                case "+":
                    answer += i==1 ? (Integer.parseInt(list[i-1]) + Integer.parseInt(list[i+1])) : Integer.parseInt(list[i+1]);
                    System.out.println(answer);
                    break;
                case "-":
                    answer += i==1 ? (Integer.parseInt(list[i-1]) - Integer.parseInt(list[i+1])) : -Integer.parseInt(list[i+1]);
                    break;
            }
        }

        return answer;
    }
}