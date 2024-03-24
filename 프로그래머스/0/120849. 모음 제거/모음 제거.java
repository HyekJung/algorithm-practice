import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        ArrayList <String> list = new ArrayList<>();
        String [] myStr = my_string.split("");
        
        //list 배열 담기
        for(String str: myStr){
            list.add(str);
        }
        
        //모음 있는지 확인하기
        for (int i = 0; i < list.size(); i++) {
            // 현재 문자가 모음이 아닌 경우에만 문자열에 추가
            if (!list.get(i).equals("a") &&
                !list.get(i).equals("e") &&
                !list.get(i).equals("i") &&
                !list.get(i).equals("o") &&
                !list.get(i).equals("u")) {
                answer += list.get(i);
            }
        }
        return answer;
    }
}