import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        
        // 작업 반복을 위한 반복문 생성
        while(true){
            if(i >= arr.length){ //i가 arr의 길이보다 크면 멈추기
                break;
            }
            
            int last = (stk.size() > 0) ? stk.get(stk.size()-1) : 0;
            
            
            if(stk.size() == 0){ //stk가 빈배열이라면 arr[i] 추가 및 i+1
                stk.add(arr[i]);
                i++;
            }else if(last < arr[i]){ //stk에 원소가 있고, arr[i]보다 작을 때
                stk.add(arr[i]);
                i++;
            }else if(last >= arr[i]){ //stk에 원소가 있고, arr[i]보다 클 때
                stk.remove(stk.size()-1);
            }
            
        }
        return stk;
    }
}