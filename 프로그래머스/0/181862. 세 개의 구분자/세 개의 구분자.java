import java.util.*;

class Solution {
    public ArrayList<String> solution(String myStr) {
        //abc 문자 중 하나
        String[] parts = myStr.split("[abc]+");
        
        ArrayList<String> list = new ArrayList<>();
        for(String part : parts){
            if(!part.isEmpty()){
                list.add(part);
            }
        }
        
        //만약에 list가 비었다면 EMPTY 넣기
        if(list.isEmpty()){
            list.add("EMPTY");
        }
        return list;
    }
}