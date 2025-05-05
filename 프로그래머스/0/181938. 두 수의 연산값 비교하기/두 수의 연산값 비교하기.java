class Solution {
    public int solution(int a, int b) {
        int num = Integer.parseInt(String.join("", String.valueOf(a), String.valueOf(b)));
        int calculate = 2 * a * b;
        return num < calculate ? calculate : num;
    }
}