import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        //각 원소 존재여부 확인할 map 생성
        HashMap<Character, Integer> map= new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        // s를 각 단어로 list에 저장
        for(int i=0; i<s.length(); i++){
            // s의 i번째의 존재여부를 확인, 값 넣기
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character key:map.keySet()){
            if(map.get(key)==1){
                list.add(key);
            }
        }
        // list 정렬(사전 순)
        Collections.sort(list);
        
        String answer="";
        for(Character as: list){
            answer+=as;
        }
        return answer;
    }
}