class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        
        char[] result = new char[arr.length];
        for(int i = 0; i < arr.length ; i++) {
            char temp = arr[i];
            int cnt = 0;
            for (int j = i; j < arr.length; j++) {
                if(temp < arr[j]) {
                    temp = arr[j];
                    cnt = j;
                    arr[cnt] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return String.valueOf(arr);
    }
}