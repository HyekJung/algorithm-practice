class Solution {
    public int solution(int n) {
        int answer = 0; //3의 나라
        int cnt = 0; // 10진수
        
        while(cnt < n){
            answer++;
            if(String.valueOf(answer).contains("3") || answer % 3 == 0){ //3과 3의 배수가 들어간 경우
                continue;
            }
            cnt++; //일반 수 증가
        }
        return answer;
    }
}