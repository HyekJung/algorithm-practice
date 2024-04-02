import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        
        //문자열 정렬 - 대문자에서 소문자 순으로
        Arrays.sort(charArray);
        
        //문자열로 합치기 - 역순으로
        for(char array:charArray){
            answer = array + answer;;
        }
        
        return answer;
    }
}