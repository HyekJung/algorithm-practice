import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = (my_string.toLowerCase()).toCharArray(); //소문자로 변경, char 배열
        
        Arrays.sort(ch); //정렬
        
        for(char arr : ch){
            answer += arr;
        }
        
        return answer;
    }
}