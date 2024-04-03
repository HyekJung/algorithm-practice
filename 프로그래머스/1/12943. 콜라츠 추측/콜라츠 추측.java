class Solution {
    public int solution(int num) {
        int answer = 0;
        //타입 변환 - int 오버플로우 방지
        long longNum = (long)num;
        
        //num이 1이라면
        if(longNum == 1){
            return 0;
        }
        
        //콜라츠 추측 반복문
        for(int i = 1; i<500; i++){
            if(longNum % 2 == 0){ //짝수
                longNum = longNum/2;
            }else{ //홀수
                longNum = (longNum * 3) + 1;
            }
            
            if(longNum == 1){ //num이 1이 되면 종료
                answer = i; //i = 반복 횟수
                break;
            }
        }

        // 500번 반복 후에도 num이 1이 되지 않았을 경우
        if(longNum != 1) {
            return -1;
        }
        
        //반복문 종료 후 answer
        return answer;
    }
}