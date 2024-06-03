class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        
        for(int i = 0; i < ch.length; i++){
            if(Character.isLowerCase(ch[i])){ //소문자
                ch[i] = Character.toUpperCase(ch[i]);
                answer += ch[i];
            }else{ //대문자 시
                ch[i] = Character.toLowerCase(ch[i]);
                answer += ch[i];
            }
        }
        return answer;
    }
}