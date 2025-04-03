class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] a = s.split(" ");
        int temp = 0;
        
        for(String b : a) {
            if (b.equals("Z")) {
                answer -= temp;
            }
            else {
                answer += Integer.parseInt(b);
                temp = Integer.parseInt(b);
            }
            System.out.println(b);
        }
        
        return answer;
    }
}