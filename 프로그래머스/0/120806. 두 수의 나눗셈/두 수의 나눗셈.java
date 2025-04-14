class Solution {
    public int solution(int num1, int num2) {
        double divideResult = (double)num1/num2 * 1000;
        int convertDoubleToInt = (int)divideResult;
        
        return convertDoubleToInt;
    }
}