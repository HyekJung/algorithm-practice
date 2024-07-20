import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < flag.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i] * 2; j++){ //arr[i] * 2배 추가
                    list.add(arr[i]);
                }
            }else{
                for(int k = 0; k < arr[i]; k++){ 
                    if(!list.isEmpty()){
                        list.remove(list.size() - 1); //마지막 원소 제거   
                    }
                }   
            }
        }
        return list;
    }
}