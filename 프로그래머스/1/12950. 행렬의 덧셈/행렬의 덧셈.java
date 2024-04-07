class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        //새로운 배열 생성
        int[][] answer = new int[arr1.length][arr1[0].length]; 
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr1[0].length; j++){ //같은 위치의 원소 더함
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}