import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        int[] answer = {};
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(i == 0 || arr[i-1] != arr[i]){
                list.add(arr[i]);
            }
        }

        return list;
    }
}