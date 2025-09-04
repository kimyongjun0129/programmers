class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<numLog.length-1; i++) {
            int value = numLog[i+1] - numLog[i];

            switch(value) {
                case 1:
                    sb.append('w');
                    break;
                case -1:
                    sb.append('s');
                    break;
                case 10:
                    sb.append('d');
                    break;
                case -10:
                    sb.append('a');
                    break;
                default:
                    break;
            }
        }
        
        return sb.toString();
    }
}