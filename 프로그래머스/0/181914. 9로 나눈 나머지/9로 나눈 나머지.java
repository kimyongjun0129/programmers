class Solution {
    public int solution(String number) {
        int sum = 0;
        
        for(char num: number.toCharArray()) {
            sum += (int)(num - '0');
        }
        
        return sum % 9;
    }
}