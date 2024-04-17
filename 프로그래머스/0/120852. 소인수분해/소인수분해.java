import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        //소인수 분해 진행 = 소수는 자기 자신과 약수 - 2부터 순회
        for(int i = 2; i <= n; i++){
            if(n % i == 0){ // 소인수이면 추가
                list.add(i); //소수로 확인된 경우 n추가
                
                while(n % i == 0){ // 소인수가 될때 까지 반복
                    n /= i; //다음 소인수
                } 
            }
        }
        return list;
    }
}