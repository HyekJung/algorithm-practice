import java.util.*;

class Solution {
    public List<String> solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for(String str : strArr){
            if(!str.contains("ad")){ //문자열이 "ad"를 포함하지 않는다면 추가
                list.add(str);
            }            
        }

        return list;
    }
}