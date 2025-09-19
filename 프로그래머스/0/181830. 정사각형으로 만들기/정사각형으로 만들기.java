class Solution {
    public int[][] solution(int[][] arr) {
        
        int row = arr.length;       // 행
        int column = arr[0].length; // 열
        
        if (row > column) {
            column = row;
        } else {
            row = column;
        }
        
        int[][] answer = new int[row][column];
        
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}