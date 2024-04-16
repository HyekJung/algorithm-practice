import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //2인 원소 찾기 - 인덱스 번호
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){ //배열의 원소가 2이면
                list.add(i); //인덱스 번호를 list에 저장
            }
        }
        
        //list가 비어있지 않다면 - 2가 있다면
        if(!list.isEmpty()){
            //인덱스 중 작은 인덱스와 큰 인덱스 찾기
            int min = Collections.min(list);
            int max = Collections.max(list);

            //인덱스 토대로 배열 복사
            return Arrays.copyOfRange(arr, min, max+1);
            
        }else{ // 2가 없다면
            return new int[]{-1};
        }
    }
}