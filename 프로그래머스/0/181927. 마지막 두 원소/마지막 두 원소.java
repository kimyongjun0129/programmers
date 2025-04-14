class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] list = new int[length + 1];
        
        if(num_list[length-1]>num_list[length-2]) {
            int a = num_list[length-1] - num_list[length-2];
            for (int i = 0; i < length; i++) {
                list[i] = num_list[i];
            }
            list[length] = a;
            return list;
        } else {
            int a = num_list[length-1] * 2;
            for (int i = 0; i < length; i++) {
                list[i] = num_list[i];
            }
            list[length] = a;
            return list;
        }
    }
}