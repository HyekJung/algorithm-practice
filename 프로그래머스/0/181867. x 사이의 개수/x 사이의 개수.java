import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] str = myString.split("x");
        
        //배열 길이 알기
        for(String len : str){
            list.add(len.length()); // 길이를 list에 저장
        }
        
        //마지막 문자열이 x로 끝난다면
        if(myString.endsWith("x")){
            list.add(0); //0 추가하기
        }
        
        return list;
    }
}