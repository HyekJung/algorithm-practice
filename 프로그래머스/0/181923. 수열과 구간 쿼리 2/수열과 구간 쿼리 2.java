import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        for(int[] query : queries){
            int start = query[0];
            int end = query[1];
            int k = query[2];
            
            list.add(getMin(arr, start, end, k));
        }
        return list.stream().mapToInt(Integer::intValue).toArray(); //int 배열로 변환
    }
    
    //최솟값을 찾는 함수
    private int getMin(int[]arr, int start, int end, int k){
        int min = Integer.MAX_VALUE; //최솟값 비교하기 위한 초기값 설정
        boolean minFound = false;
        
        for(int i = start; i <= end; i++){
            if(arr[i] > k){
                min = Math.min(min, arr[i]);
                minFound = true;
            }
        }
        return minFound ? min : -1; //if문에 들어가는 최솟값이 없을 경우 -1반환
    }
}