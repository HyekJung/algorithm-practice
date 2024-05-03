import java.util.*;

class Solution {
    public List<String> solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        
        for(String pic : picture){
            StringBuilder sb = new StringBuilder(); //문자열 변형
            
            for(char c : pic.toCharArray()){
                for(int i = 0; i < k; i++){ //가로
                    sb.append(c);
                }
            }
            
            for(int j = 0; j < k; j++){ //세로
                list.add(sb.toString());
            }
        }
        return list;
    }
}