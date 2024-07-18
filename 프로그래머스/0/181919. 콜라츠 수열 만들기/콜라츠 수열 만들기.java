import java.util.*;

class Solution {
    public List solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        list.add(n); //초기값 추가
        
        while(n != 1){ //n이 1이 될때 정지
            
            if(n % 2 == 0){ //짝수
                n /= 2;
            }else{ //홀수
                n = 3 * n + 1;
            }
            
            list.add(n);
        }
        
        return list;
    }
}