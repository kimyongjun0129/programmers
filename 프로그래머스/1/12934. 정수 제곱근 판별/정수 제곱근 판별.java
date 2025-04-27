class Solution {
    public long solution(long n) {
        if (Math.sqrt(n) % 1 == 0) {
            long num = (long)Math.sqrt(n);
            return (num+1)*(num+1);
        }
        else return -1;
    }
}