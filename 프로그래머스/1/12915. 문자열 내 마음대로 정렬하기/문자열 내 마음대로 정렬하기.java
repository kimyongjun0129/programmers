class Solution {
    public String[] solution(String[] strings, int n) {
        int len = strings.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                char c1 = strings[j].charAt(n);
                char c2 = strings[j + 1].charAt(n);

                // n번째 문자가 더 크면 자리 바꿈
                if (c1 > c2) {
                    swap(strings, j, j + 1);
                }
                // n번째 문자가 같으면 사전순 정렬
                else if (c1 == c2) {
                    if (strings[j].compareTo(strings[j + 1]) > 0) {
                        swap(strings, j, j + 1);
                    }
                }
            }
        }

        return strings;
    }

    private void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
