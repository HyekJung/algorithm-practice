import java.util.*;
class Solution {
    public int solution(int left, int right) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        
        //약수 개수 구하기
        for(int i = left; i<=right; i++){
            for(int j = 1; j<=i; j++){
                //j로 나누어 떨어지면 약수
                if(i % j == 0){
                    map.put(i, map.getOrDefault(i, 0)+1); //수, 약수 추가
                }
            }
        }
        //약수의 개수가 짝수
        for(int key : map.keySet()){
            if(map.get(key) % 2 == 0){//약수의 갯수가 짝수면
                answer += key;
            }else{
                answer -= key;
            }
        }

        return answer;
    }
}