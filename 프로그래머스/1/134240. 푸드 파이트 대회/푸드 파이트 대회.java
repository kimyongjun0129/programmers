class Solution {
    public String solution(int[] food) {
        /*
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i<food.length; i++) {
            int foodPerPerson = food[i]/2;
            for (int j = 0; j<foodPerPerson; j++) {
                sb.append(i);
            }
        }
        sb.append(0);
        for (int i = food.length-1; i>0; i--) {
            int foodPerPerson = food[i]/2;
            for (int j = 0; j<foodPerPerson; j++) {
                sb.append(i);
            }
        }
        return sb.toString();
        */
        
        /* 15s
        String answer = "0";
        for (int i = food.length-1; i>0; i--) {
            for (int j = 0; j<food[i]/2; j++) {
                answer = i + answer + i; 
            }
        }
        return answer;
        */

            StringBuilder build = new StringBuilder();

            for(int i=1; i<food.length; i++) {              
                for(int q=0; q<food[i]/2; q++) {
                    build.append(i);
                }
            }
            String answer = build.toString()+"0"+build.reverse().toString();
            return answer;

    }
}