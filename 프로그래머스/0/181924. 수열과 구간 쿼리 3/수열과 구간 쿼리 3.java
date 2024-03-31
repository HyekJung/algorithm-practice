class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int[] query : queries){
            reverse(query, arr);
        }
        
        return arr;
        
    }
    //인덱스 위치 바꿔주는 메소드
    private static int[] reverse(int[] query, int[] arr){
        int start = query[0];
        int end = query[1];
        
        //값을 바꾸기 위한 임의의 변수 temp
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        return arr;
    }
}