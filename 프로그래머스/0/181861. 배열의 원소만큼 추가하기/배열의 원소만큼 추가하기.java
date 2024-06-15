import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){ //원소만큼 반복
                answer.add(arr[i]); //추가
            }
        }
        
        return answer;
    }
}