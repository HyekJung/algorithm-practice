import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        HashMap<Integer, Character> map = new HashMap<>();
        
        int k = 0;
        for(char i = 'a'; i <= 'z'; i++){
            map.put(k++, i); //번호, 문자    
        }
        
        String str = String.valueOf(age); //문자열 변환
        String[] arr = str.split(""); //자리수로 나누기
        
        for(String a : arr){
            answer += map.get(Integer.parseInt(a)); //나이 문자열 int 변환
        }
        
        
        return answer;
    }
}