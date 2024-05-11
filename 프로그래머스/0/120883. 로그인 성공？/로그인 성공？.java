import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        HashMap<String, String> map = new HashMap<>();
                                                    
        for(String[] base : db){
            String id = base[0];
            String pw = base[1];
            
            map.put(id, pw); //로그인 정보 저장
        }
        
        for(String key : map.keySet()){
            if(id_pw[0].equals(key)){ //아이디 일치 시
                if(id_pw[1].equals(map.get(key))){
                    return "login"; // 비밀번호 불일치
                }
                return "wrong pw"; //아이디와 비밀번호 모두 일치
            }
        }
        return "fail"; //기본값
    }
}