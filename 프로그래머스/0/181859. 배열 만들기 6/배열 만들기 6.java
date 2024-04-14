import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int length = arr.length;
        int i = 0;
        
        // i가 arr의 길이보다 작으면
        while(i < length){
            int size = stk.size();
            if(size == 0){ //1번
                stk.add(arr[i]);
                i++;
            }else if(size != 0 && stk.get(size - 1) == arr[i]){ //2번
                stk.remove(size - 1);
                i++;
            }else if(size != 0 && stk.get(size - 1) != arr[i]){ //3번
                stk.add(arr[i]);
                i++;
            }
        }
        if(stk.size() == 0){ //빈 배열이라면
            stk.add(-1);
        }
        return stk;
    }
}