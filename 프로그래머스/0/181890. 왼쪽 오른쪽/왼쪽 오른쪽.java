import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        for(int i = 0; i<str_list.length; i++){
            String first = str_list[i];
            
            //문자열 'l'이 먼저 나오는 경우
            if(first.equals("l")){
                return Arrays.copyOfRange(str_list, 0, i); //배열 복사
            }else if(first.equals("r")){
                return Arrays.copyOfRange(str_list, i+1, str_list.length);
            }
        }
        //빈문자열 시
        return answer;
    }
}