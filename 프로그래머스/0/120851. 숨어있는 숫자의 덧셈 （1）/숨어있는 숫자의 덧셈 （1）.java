class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] ch = my_string.toCharArray();
        
        for(int i = 0; i < ch.length; i++){
            if(Character.isDigit(ch[i])){ //숫자인지 문자인지 판별
                answer += ch[i] - '0'; //숫자 더하기
            }
        }
        return answer;
    }
}