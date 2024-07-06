import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0; //갯수가 없을 경우
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String str1 : s1){
            map.put(str1, map.getOrDefault(str1, 0) + 1); //원소 갯수 넣기
        }
        
        for(String str2 : s2){
            if(map.containsKey(str2)){ //map에 str2가 있으면
                answer += map.get(str2);
            }
        }
        return answer;
    }
}