import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int[] copy = arr.clone();
        int answer = 0;
        
        while(true){
            int[] crr = copy.clone(); //answer-1 배열
            for(int i = 0; i < arr.length; i++){
                //50보다 크거나 같은 짝수
                if(copy[i] >= 50 && copy[i] % 2 == 0) {
                    copy[i] = copy[i] / 2;
                }else if(copy[i] < 50 && copy[i] % 2 != 0){ //홀수
                    copy[i] = copy[i] * 2 + 1;
                }
            }
            answer++; // 반복 끝날때마다 횟수 증가
            
            if(Arrays.equals(copy, crr)){
                break;
            }
        }
        return answer-1; // 전의 배열 기준으로 하므로
    }
}