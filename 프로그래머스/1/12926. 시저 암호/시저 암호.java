import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){ //소문자인 경우
                char shifted = (char) ((ch - 'a' + n) % 26 + 'a');
                sb.append(shifted);
            }else if(Character.isUpperCase(ch)){ //대문자인 경우
                char shifted = (char) ((ch - 'A' + n) % 26 + 'A');
                sb.append(shifted);
            }else{ //공백인 경우 - 대소문자가 아니면 공백 
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}