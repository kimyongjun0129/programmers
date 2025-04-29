class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        
        char[] arr = new char[len];
        
        for (int i = 0 ; i<len; i++) {
            if(i<len-4) arr[i] = '*';
            else arr[i] = phone_number.charAt(i);
        }
        return String.valueOf(arr);
    }
}