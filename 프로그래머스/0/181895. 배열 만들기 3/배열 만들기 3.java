import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        
        for(int[] vals : intervals){
            int first = vals[0];
            int last = vals[1];
            
            for(int i = first; i <= last; i++){
                list.add(arr[i]);
            }
        }
        return list;
    }
}