class Solution {
    public String solution(int n) {
        //return할 문자열
        String odd = "수";
        String even = "박";
        String answer = "";
        
        //문자열 연결할 반복문
        for(int i = 1; i<=n; i++){
            //짝수, 홀수에 따라 문자열 붙이기
            if(i%2==1){ //홀수일 경우
                answer+=odd;
            }else{
                answer+=even;
            }
        }
        
        return answer;
    }
}