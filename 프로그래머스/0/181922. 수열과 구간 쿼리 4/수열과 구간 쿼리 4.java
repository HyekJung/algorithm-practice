class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            //s <=i <= e
            for(int i = s; i <= e; i++){
                if(i % k == 0){ //k의 배수이면
                    arr[i] += 1; //+1
                }
            } 
            
        }
        return arr;
    }
}