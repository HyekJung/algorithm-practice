import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap <String, Integer>map = new HashMap<>();
        
        //선수가 호출된 횟수 저장
        //key: players 원소, value: 등수
        for(int i=0; i<players.length; i++){
            map.put(players[i], i+1);
        }
        //현재 선수와 앞의 선수 자리 바꾸기
        for(String calling : callings){
            //현재 선수 등수
            int nowPlayer = map.get(calling);
            //앞의 선수의 등수
            int frontPlayer = nowPlayer-1;
            
            //기존 키값을 앞의 선수 등수(value)로 교체
            map.put(calling, frontPlayer);
            map.put(players[frontPlayer-1], nowPlayer);
            
            //선수 교체
            players[nowPlayer-1] = players[frontPlayer-1];
            players[frontPlayer-1] = calling;
        }
        
        return players;
    }
}