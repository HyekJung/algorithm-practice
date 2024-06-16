import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices); //순서대로 문자 지워야하므로 오름차순 정렬
        
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int i = indices.length - 1; i >= 0 ; i--){
            sb.deleteCharAt(indices[i]);
        }
        
        return sb.toString();
    }
}