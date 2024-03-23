import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        //문제: 등장횟수가 0이 아닌것(동명이인-1 = 1, 일반:0)
        
        HashMap <String,Integer> map = new HashMap<>();
        String answer ="";
        
        //마라톤에 참여한 선수들의 이름, 등장 횟수
        for(int i=0; i<participant.length; i++){
            //key: participant의 원소, value: 등장 횟수
            map.put(participant[i], map.getOrDefault(participant[i],0)+1);
        }
        
        //완주자 명단
        for(int j=0; j<completion.length; j++){
            int complete = map.get(completion[j]);
            //등장 횟수 1씩 감소시킴
            map.put(completion[j], complete-1);
        }
        // 감소시킨 횟수가 1일때(동명이인 없는 경우 0)
        for(String key: map.keySet()){
            if(map.get(key)!=0){
                answer = key;
            }
        }
        return answer;
    }
}