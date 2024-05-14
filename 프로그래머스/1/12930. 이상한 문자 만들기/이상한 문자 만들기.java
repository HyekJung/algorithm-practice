class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){ //공백이 있으면 다시 인덱스 0
                cnt = 0;
                answer += " "; //공백 추가
                continue;
            }
            
            if(cnt % 2 == 0){ //인덱스가 짝수
                answer += String.valueOf(Character.toUpperCase(ch));
                cnt++;
            }else{ // 홀수
                answer += String.valueOf(Character.toLowerCase(ch));
                cnt++;
            }
        }
        return answer; 
    }
}