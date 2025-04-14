class Solution {
    public int solution(int n, int k) {
        int chickenPrice = n * 12000;
        int beveragePrice = (k-(n/10)) * 2000;
        int total = chickenPrice + beveragePrice;
        return total;
    }
}