class Solution {
    public int solution(int a, int b) {
        int one = Integer.parseInt(String.join("", String.valueOf(a),String.valueOf(b)));
        int two = Integer.parseInt(String.join("", String.valueOf(b),String.valueOf(a)));
        return  one < two ? two : one;
    }
}